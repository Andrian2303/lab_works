package ua.lviv.iot.repair.model;

public class Socket extends AbstractMaterials{
    protected TypeOfConnector typeOfSocket;
   protected int lenght;
   protected int wenght;

   public TypeOfConnector getTypeOfSocket (){
       return typeOfSocket;
   }

    public int getLenght() {
        return lenght;
    }

    public int getWenght() {
        return wenght;
    }

    public Socket(String materialsBrand,String materialsColor,double priceInUAH,double materialSize,String companyOfManufactures,boolean neededForSockets,TypeOfConnector typeOfSocket,int lenght,int wenght){
        super(materialsBrand,materialsColor,priceInUAH,materialSize,companyOfManufactures,neededForSockets);
        this.typeOfSocket=typeOfSocket;
        this.lenght=lenght;
        this.wenght=wenght;
    }
}
