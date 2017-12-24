import serial
import time
import struct
import pyautogui

state = True;

#  '/dev/ttyACM0' is a port
arduino = serial.Serial('/dev/ttyACM0', 9600)
time.sleep(2)
pyautogui.PAUSE = 1
pyautogui.FAILSAFE = True

while 1:
    var = arduino.readline()
    print(var)
    if state:
        if b'BothLocked' in var:
            pyautogui.hotkey('winleft', 'up')
        if b'LeftPushed' in var:
            pyautogui.hotkey('winleft', 'left')
        if b'LeftPulled' in var:
            pyautogui.hotkey('altleft', 'tab')
        if b'RightPushed' in var:
            pyautogui.hotkey('winleft', 'right')
        if b'RightPulled' in var:
            pyautogui.hotkey('winleft', 'down')
    if not state:
        if b'BothLocked' in var:
            pyautogui.hotkey('enter')
        if b'LeftPushed' in var:
            pyautogui.hotkey('altleft', 'tab')
        if b'LeftPulled' in var:
            pyautogui.hotkey('winleft')
        if b'RightPushed' in var:
            pyautogui.hotkey('winleft')
        if b'RightPulled' in var:
            pyautogui.hotkey('winleft')
    if b'ChangeState' in var:
        state = not state
    var = ''
