package com.bridgelabz.test;

import org.junit.Assert;
import org.junit.Test;

import com.hashtable.MyHashMap;
import com.hashtable.MyLinkedHashMap;

public class MyHashMapTest {
	@Test
    public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency(){
        String sentence="To be or not to be";
        MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for(String word : words)
        {
            Integer value=myHashMap.get(word);
            if(value==null) value=1;
            else value=value+1;
            myHashMap.add(word,value);
        }
        int frequency =myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(2,frequency);
    }
    @Test
    public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency()
    {
        String sentence="Paranoids are not paranoid because they are paranoid but"+"because they keep putting themselves deliberately into"+"paranoid avoidable situations";
        MyLinkedHashMap<String,Integer> myLinkedHashMap=new MyLinkedHashMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for (String word : words )
        {
            Integer value =myLinkedHashMap.get(word);
            if (value==null) value=1;
            else value=value+1;
            myLinkedHashMap.add(word,value);
        }
        System.out.println(myLinkedHashMap);
        int frequency=myLinkedHashMap.get("paranoid");
        System.out.println(frequency);
        Assert.assertEquals(2,frequency);
    }
}

