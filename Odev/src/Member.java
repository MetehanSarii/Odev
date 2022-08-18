public class Member implements INewMember{

    @Override
    public void addMember(NewMemberInfo newMemberInfo) {
        System.out.println("yeni bir �ye eklendi.\t" + " �ye ismi:\t" + newMemberInfo.getFirstName() +" " + "�ye soyismi:\t" +newMemberInfo.getLastName());
    }

    @Override
    public void updateMember(NewMemberInfo newMemberInfo) {
        System.out.println("�ye g�ncellenmesi tamamland�." + "G�ncellenen isim:\t" +newMemberInfo.getFirstName());
    }

    @Override
    public void deleteMember(NewMemberInfo newMemberInfo) {
        System.out.println("�ye kayd�n�z silindi!\t" +"Silinen isim:\t" +newMemberInfo.getFirstName());
    }
}