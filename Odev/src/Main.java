public class Main {
    public static void main(String[] args) {
        KimlikDogrulama kimlikDogrulama = new KimlikDogrulama();
        System.out.println("Kimlik doğrulama işlemi yapılıyor.....\n");
        kimlikDogrulama.dogrulama(123456789,"Metehan", "Sarı", 2001);

        Member member = new Member();
         NewMemberInfo ilkSatıs = new NewMemberInfo(123456789,"Samet", "Günseven", 1996);
         member.addMember(ilkSatıs);

         Game game = new Game();
         NewMemberInfo ilkSatısBilgileri = new NewMemberInfo(123456789,"Utku","Darboğaz",2003);
         game.gameSales(ilkSatısBilgileri);

         CampaignManager campaignManager = new CampaignManager();
         campaignManager.addCampaign();

         Game game1 = new Game();
         game1.checkCampaign();


    }
}