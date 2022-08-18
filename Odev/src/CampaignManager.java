public class CampaignManager implements ICampaignManagement{
    @Override
    public void addCampaign() {
        System.out.println("Sistem tarafýnfan yeni bir kampanya eklendi.");
    }

    @Override
    public void deleteCampaign() {
        System.out.println("Kampanya silme iþlemi tamamlandý.");
    }

    @Override
    public void updateCampaign() {
        System.out.println("Kampanya güncellendi.");
    }
}