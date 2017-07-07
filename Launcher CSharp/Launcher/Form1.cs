using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Launcher
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            closebtn.Click += new EventHandler(Closebtn_Click);
            StartBtn.Click += new EventHandler(Start_Click);
            realm.Click += new EventHandler(Realm_Click);
            

        }
        private void Closebtn_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
        private void Start_Click(object sender, EventArgs e)
        {
            Process.Start("C:/Users/ivana/Downloads/WoW TBC/WoW TBC/Wow.exe");
            Application.Exit();

        }
        private void Realm_Click(object sender, EventArgs e)
        {
            Form form2 = new Form2();
            this.Hide();
            form2.Show();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
