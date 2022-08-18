public interface ISales {
    void gameSales(NewMemberInfo newMemberInfo);
    //bu metot ile NewMemberInfo dan aldýðýmýz bilgiler ile oyunun kime satýldýðýný kontrol ediyoruz.

    void checkCampaign();
    //bu metot ile satýþlarda kampanya entegrasyonu kontrol edilmiþtir.

}