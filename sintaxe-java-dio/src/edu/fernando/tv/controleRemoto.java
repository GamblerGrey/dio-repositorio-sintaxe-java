package edu.fernando.tv;


    public class controleRemoto {

      public static void main(String[] args) throws Exception {
         
         smartTv smartTv = new smartTv();


            smartTv.ligar();
            System.out.print("Novo status -> TV ligada? " + smartTv.ligada);
      
            smartTv.desligar();
            System.out.print("Novo status -> Tv ligada? " + smartTv.ligada);

            smartTv.aumentarVolume();
            System.out.print("Volume atual:" + smartTv.volume);

            smartTv.diminuirVolume();
            System.out.print("Volume atual: " + smartTv.volume);

            smartTv.subirCanal();
            System.out.print("Canal atual:  " + smartTv.canal);

            smartTv.descerCanal();
            System.out.print("Canal atual:  " + smartTv.canal);

            smartTv.escolherCanal();
            System.out.print("Canal escolhido:  " + smartTv.canal);





         }


      

      } 