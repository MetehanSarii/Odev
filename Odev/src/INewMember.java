public interface INewMember {
    //yeni bir �ye ekleme
    void addMember(NewMemberInfo newMemberInfo);

    //eklenen bir �yeyi g�ncelleme
    void updateMember(NewMemberInfo newMemberInfo);

    //ekli olan bir �yeyi silme
    void deleteMember(NewMemberInfo newMemberInfo);


}