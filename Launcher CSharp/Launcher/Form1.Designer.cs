namespace Launcher
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.StartBtn = new System.Windows.Forms.Button();
            this.realm = new System.Windows.Forms.Button();
            this.closebtn = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // StartBtn
            // 
            this.StartBtn.BackColor = System.Drawing.Color.Transparent;
            this.StartBtn.Location = new System.Drawing.Point(35, 25);
            this.StartBtn.Name = "StartBtn";
            this.StartBtn.Size = new System.Drawing.Size(75, 23);
            this.StartBtn.TabIndex = 1;
            this.StartBtn.Tag = "Start";
            this.StartBtn.Text = "Start";
            this.StartBtn.UseVisualStyleBackColor = false;
            // 
            // realm
            // 
            this.realm.BackColor = System.Drawing.Color.Transparent;
            this.realm.Location = new System.Drawing.Point(35, 55);
            this.realm.Name = "realm";
            this.realm.Size = new System.Drawing.Size(75, 23);
            this.realm.TabIndex = 2;
            this.realm.Tag = "realm";
            this.realm.Text = "Realmlist";
            this.realm.UseVisualStyleBackColor = false;
            // 
            // closebtn
            // 
            this.closebtn.Location = new System.Drawing.Point(35, 85);
            this.closebtn.Name = "closebtn";
            this.closebtn.Size = new System.Drawing.Size(75, 23);
            this.closebtn.TabIndex = 3;
            this.closebtn.Tag = "closebtn";
            this.closebtn.Text = "Close";
            this.closebtn.UseVisualStyleBackColor = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSize = true;
            this.BackgroundImage = global::Launcher.Properties.Resources.world_of_warcraft_black_background_1752573_1920x1080;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(664, 281);
            this.Controls.Add(this.closebtn);
            this.Controls.Add(this.realm);
            this.Controls.Add(this.StartBtn);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximumSize = new System.Drawing.Size(680, 320);
            this.MinimumSize = new System.Drawing.Size(680, 320);
            this.Name = "Form1";
            this.Text = "Launcher v0.8";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button StartBtn;
        private System.Windows.Forms.Button realm;
        private System.Windows.Forms.Button closebtn;
    }
}

