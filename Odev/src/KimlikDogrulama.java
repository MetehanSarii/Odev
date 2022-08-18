public class KimlikDogrulama implements IDogrulama{
    @Override
    public void dogrulama(int id , String firstName,String lastName,int birthyear) {
        System.out.println("Kimlik doðrulamasý baþarýlý\t" + "giriþ yapan kullanýcý ismi:\t" + firstName);

    }
}