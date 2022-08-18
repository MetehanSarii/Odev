public class Main {
    public static void main(String[] args) {
        KimlikDogrulama kimlikDogrulama = new KimlikDogrulama();
        System.out.println("Kimlik doðrulama iþlemi yapýlýyor.....\n");
        kimlikDogrulama.dogrulama(123456789,"Metehan", "Sarý", 2001);

        Member member = new Member();
         NewMemberInfo ilkSatýs = new NewMemberInfo(123456789,"Samet", "Günseven", 1996);
         member.addMember(ilkSatýs);

         Game game = new Game();
         NewMemberInfo ilkSatýsBilgileri = new NewMemberInfo(123456789,"Utku","Darboðaz",2003);
         game.gameSales(ilkSatýsBilgileri);

         CampaignManager campaignManager = new CampaignManager();
         campaignManager.addCampaign();

         Game game1 = new Game();
         game1.checkCampaign();


    }
}