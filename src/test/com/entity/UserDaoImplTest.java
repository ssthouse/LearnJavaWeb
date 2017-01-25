package test.com.entity;

import com.entity.UserDao;
import com.entity.UserDaoImpl;
import com.entity.UserEntity;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * UserDaoImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 21, 2017</pre>
 */
public class UserDaoImplTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: save(UserEntity userEntity)
     */
    @Test
    public void testSave() throws Exception {
//TODO: Test goes here...
        UserDao userDao = new UserDaoImpl();
        try {
            UserEntity userEntity = new UserEntity();
            userEntity.setUserId(20);
            userEntity.setName("ShenShuntian");
            userEntity.setPassword("123");
            userEntity.setType("admin");
            userDao.save(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method: findById(int id)
     */
    @Test
    public void testFindById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: delete(UserEntity user)
     */
    @Test
    public void testDelete() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: update(UserEntity userEntity)
     */
    @Test
    public void testUpdate() throws Exception {
//TODO: Test goes here... 
    }


} 
