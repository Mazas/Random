int triggerL = 8;
int triggerR = 10;
int echoL = 9;
int echoR = 11;
long time;
int dist, distL, distR;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  attachInterrupt(1,changeState,RISING);
  pinMode(triggerL,OUTPUT);
  pinMode(triggerR,OUTPUT);
  pinMode(echoL,INPUT);
  pinMode(echoR,INPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  getDistance(triggerL, echoL);
  distL = dist;
  getDistance(triggerR,echoR);
  distR = dist;

  // Debugging
  //Serial.print("L=");
  
  //Serial.print("R=");
  //Serial.println(distR);


  // Both Hands
  if(distL<=30&&distR<=30){
    Serial.println("BothLocked");
    delay(1000);    
  }

  //Left Hand
  if(distL<=15&&distR>30){
    Serial.println("LeftPushed");
    delay(1000);
  }
  if(distL>15&&distL<30&&distR>30){
    Serial.println("LeftPulled");
    delay(1000);
  }

    // Right Hand
  if(distR<=15&&distL>30){
    Serial.println("RightPushed");
    delay(1000);
  }
  if(distR>15&&distR<30&&distL>30){
    Serial.println("RightPulled");
    delay(1000);
  }

  delay(200);
}

void getDistance(int trigger, int echo){
  digitalWrite(trigger,LOW);
  delayMicroseconds(2);
  digitalWrite(trigger, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigger, LOW);
  
  time = pulseIn(echo, HIGH);
  // The speed of sound is 340 m/s or 29 microseconds per centimeter.
  dist = time/29/2;
  if (dist>50){
    dist = 50;
  }
}

void changeState(){
  Serial.println("ChangeState");
}

