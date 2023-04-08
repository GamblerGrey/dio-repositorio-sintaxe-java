package edu.fernando.tv;

    public class smartTv{
        
        boolean ligada= false;
        int canal= 1;
        int volume= 20;


        public void ligar() {
            ligada = true;
        }
        public void desligar(){
            ligada = false;
        }
        public void aumentarVolume (){
            volume ++;
        }
        public void diminuirVolume(){
            volume --;
        }
        public void subirCanal(){
            canal++;
        }
        public void descerCanal(){
            canal--;
        }    
        public void escolherCanal(){
            canal = 13;
        }


    }