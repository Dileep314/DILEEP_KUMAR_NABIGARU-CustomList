package com.dileep.CustomList;

/**
 * Hello world!
 *
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        CustomList<Integer> list = new CustomList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(78);
        LOGGER.info(list);
        list.remove(2);
        LOGGER.info(list);
        LOGGER.info(list.get(0) );
        LOGGER.info(list.get(1) );
        LOGGER.info(list.size());
        CustomList<String>list2=new CustomList<>();
        list2.add("apple");
        list2.add("bat");
        list2.add("cat");
        list2.add("dog");
        LOGGER.info(list2);
        LOGGER.info(list.get(0));
        LOGGER.info(list2.size());
        list2.remove(2);
        LOGGER.info(list2);
    }
}