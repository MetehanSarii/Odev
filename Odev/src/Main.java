public class Main {
    public static void main(String[] args) {
        KimlikDogrulama kimlikDogrulama = new KimlikDogrulama();
        System.out.println("Kimlik do�rulama i�lemi yap�l�yor.....\n");
        kimlikDogrulama.dogrulama(123456789,"Metehan", "Sar�", 2001);

        Member member = new Member();
         NewMemberInfo ilkSat�s = new NewMemberInfo(123456789,"Samet", "G�nseven", 1996);
         member.addMember(ilkSat�s);

         Game game = new Game();
         NewMemberInfo ilkSat�sBilgileri = new NewMemberInfo(123456789,"Utku","Darbo�az",2003);
         game.gameSales(ilkSat�sBilgileri);

         CampaignManager campaignManager = new CampaignManager();
         campaignManager.addCampaign();

         Game game1 = new Game();
         game1.checkCampaign();


    }
}