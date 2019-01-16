package count.dao;

public interface SuperAdminDao extends AdminDao {
    //添加管理员
    public void addPermission(String teacherId);
    //删除管理员
    public void deletePermission(String teacherId);
}
