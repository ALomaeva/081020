import org.junit.Assert;
import org.junit.Test;

public class OlympiadTest {
  @Test
    public void test(){
      Object[] atlets=new Object[6];
      atlets[0]= new Cat();
      atlets[1]= new Cat();
      atlets[2]= new Human();
      atlets[3]= new Human();
      atlets[4]= new Robot();
      atlets[5]= new Robot();
      Object[] obstructions= new Object[6];
      obstructions[0]= new Treadmill();
      obstructions[1]= new Treadmill();
      obstructions[2]= new Wall();
      obstructions[3]= new Wall();
      obstructions[4]= new Treadmill();
      obstructions[5]= new Wall();
      for (Object atlet:atlets) {
        for (Object obstruction:obstructions) {
          if (Cat.class.equals(atlet.getClass()) && Wall.class.equals(obstruction.getClass()))
            Assert.assertTrue(((Cat) atlet).jump((Wall)obstruction));
          if (Cat.class.equals(atlet.getClass()) && Treadmill.class.equals(obstruction.getClass()))
            Assert.assertTrue(((Cat) atlet).run((Treadmill) obstruction));
          if (Human.class.equals(atlet.getClass()) && Wall.class.equals(obstruction.getClass()))
            Assert.assertTrue(((Human) atlet).jump((Wall)obstruction));
          if (Human.class.equals(atlet.getClass()) && Treadmill.class.equals(obstruction.getClass()))
            Assert.assertTrue(((Human) atlet).run((Treadmill) obstruction));
          if (Robot.class.equals(atlet.getClass()) && Wall.class.equals(obstruction.getClass()))
            Assert.assertFalse(((Robot) atlet).jump((Wall)obstruction));
          if (Robot.class.equals(atlet.getClass()) && Treadmill.class.equals(obstruction.getClass()))
            Assert.assertTrue(((Robot) atlet).run((Treadmill) obstruction));

        }
      }
    }

}
