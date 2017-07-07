using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Launcher
{
    class RealmListChanger
    {
        private string realmlist;
        public RealmListChanger(string realm)
        {
            this.realmlist = realm;
        }


        public bool save()
        {
            try
            {
                using (StreamWriter sw = new StreamWriter("C:/Users/ivana/Downloads/WoW TBC/WoW TBC/realmlist.wtf"))
                {
                    sw.WriteLine(realmlist);
                }
                return true;
            }
            catch (Exception e)
            {
                Console.WriteLine(realmlist);
                return false;
            }
        }
    }
}
