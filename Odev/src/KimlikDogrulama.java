public class KimlikDogrulama implements IDogrulama{
    @Override
    public void dogrulama(int id , String firstName,String lastName,int birthyear) {
        System.out.println("Kimlik do�rulamas� ba�ar�l�\t" + "giri� yapan kullan�c� ismi:\t" + firstName);

    }
}