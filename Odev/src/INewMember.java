public interface INewMember {
    //yeni bir üye ekleme
    void addMember(NewMemberInfo newMemberInfo);

    //eklenen bir üyeyi güncelleme
    void updateMember(NewMemberInfo newMemberInfo);

    //ekli olan bir üyeyi silme
    void deleteMember(NewMemberInfo newMemberInfo);


}