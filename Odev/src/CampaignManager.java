public class CampaignManager implements ICampaignManagement{
    @Override
    public void addCampaign() {
        System.out.println("Sistem taraf�nfan yeni bir kampanya eklendi.");
    }

    @Override
    public void deleteCampaign() {
        System.out.println("Kampanya silme i�lemi tamamland�.");
    }

    @Override
    public void updateCampaign() {
        System.out.println("Kampanya g�ncellendi.");
    }
}