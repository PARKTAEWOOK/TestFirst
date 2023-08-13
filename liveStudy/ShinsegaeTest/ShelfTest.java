package liveStudy.ShinsegaeTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShelfTest {
    Shelf shelf;

    @Before
    public void shelfCanCheckNullItem(){
        shelf = new Shelf();
        System.out.println("Eeee");
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void shelfCanAcceptAndReturnItem(){

//        if(Assert.assertNull("")){
//            shelf.put("Orange");
//        }

        Assert.assertTrue(shelf.take("Orange"));
//        try{
//            shelf.put("");
//            Assert.assertNotNull(shelf);
////            Assert.assertTrue(shelf.take("Orange"));
//        }catch (NullPointerException e){
//            exceptionRule.expect(NullPointerException.class);
//        }


//        Assert.assertTrue(shelf.take("Orange"));
    }

//    @Test(expected = NullPointerException.class)
//    public void notNullOrEmpty_doesNothingIfValueIsNotNullOrEmpty() {
//        shelf.put("");
//        Assert.assertTrue(true);
//    }


}
