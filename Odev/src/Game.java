public class Game implements ISales{
    @Override
    public void gameSales(NewMemberInfo newMemberInfo) {
        System.out.println("oyun satýn alýndý\t"+ "satýn alan:\t"  +newMemberInfo.getFirstName());

    }

    @Override
    public void checkCampaign(){
        System.out.println("oyun satýþlarýnda kampanya entegrasyonu saðlandý");
    }
}