public class SmartTv {

    //Atributos
    public boolean ligada = true;
    public int canal = 26;
    public int volume = 10;

    //Métodos

    //Informções da TV
    public void infoTv(){
        if (this.ligada) {
            System.out.println("TV está Ligada!");
        }else{
            System.out.println("TV está Desligada!");
        }

        System.out.println("Canal da sintonizado: " + this.canal);
        System.out.println("Volume está em: " + this.volume);
    }


    //Ligar e desligar
    public void onOff(boolean valor){
        this.ligada = valor;
    }

    //Aumenta ou diminuir volume da TV
    public void volume(boolean valor){

        //Se apertou o volume +
        if (valor) {
            this.volume++;
        }else{
            this.volume--;
        }
    }

    //Mudar de canal
    public void mudarCanal(int numeroCanal, String mudarCanal){

       if (mudarCanal == "") {

           if (numeroCanal > 0) {

               this.canal = numeroCanal;
           }
       }else{
           this.canal++;
       }
    }

    public void controleVolume(boolean valor){
        //Se este valor for verdadeiro o volume será aumentado
        if (valor) {


            int contador = 0;

                while (contador <= 5) {

                    int volumeAtual = this.volume + contador;


                   System.out.println("Aumentando: " + volumeAtual);
                   contador++;
                }
        }
    }


}
