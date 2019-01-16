package daoTest;

import Impl.SuperAdminDaoImpl;
import dao.SuperAdminDao;
import org.junit.Test;

public class SuperAdminTest {
    SuperAdminDao superAdminDao=new SuperAdminDaoImpl();
    @Test
    public void addPermission(){
          String teacherId="201608040118";
         superAdminDao.addPermission(teacherId);
    }
    @Test
    public void deletePermission(){
        String teacherId="201608040118";
        superAdminDao.deletePermission(teacherId);
    }
}
