public class Game implements ISales{
    @Override
    public void gameSales(NewMemberInfo newMemberInfo) {
        System.out.println("oyun sat�n al�nd�\t"+ "sat�n alan:\t"  +newMemberInfo.getFirstName());

    }

    @Override
    public void checkCampaign(){
        System.out.println("oyun sat��lar�nda kampanya entegrasyonu sa�land�");
    }
}