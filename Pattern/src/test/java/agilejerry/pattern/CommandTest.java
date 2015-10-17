package agilejerry.pattern;

import java.util.ArrayList;
import java.util.Iterator;


import junit.framework.TestCase;

public class CommandTest extends TestCase {

    public void test1(){
    	assertTrue(true);
    }
    
    public void testExecute(){
    	ArrayList<Command> list = new ArrayList<Command>();
    	list.add(new AACommand());
    	list.add(new ABCommand());
    	list.add(new AACommand(45));
    	list.add(new ABCommand(32));
    
    	for (Iterator<Command> it = list.iterator(); it.hasNext(); ){
    		assertTrue(it.next().execute());
        }
    
   }
}