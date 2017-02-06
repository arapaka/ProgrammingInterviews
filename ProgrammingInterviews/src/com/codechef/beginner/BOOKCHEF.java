package com.codechef.beginner;

import java.util.*;

/**
 * Created by archithrapaka on 10/28/16.
 */
public class BOOKCHEF {

    static class Person{
        int friendId;
        int popularityId;
        String post;

        public Person(int friendId , int popularityId , String post){
            this.friendId = friendId;
            this.popularityId = popularityId;
            this.post = post;
        }
    }

    static class PopularityComp implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
               if(p1.popularityId < p2.popularityId){
                   return 1;
               } else {
                   return -1;
               }
        }
    }

    static Person parsePerson(String [] s){
           Integer fid = Integer.parseInt(s[0]);
        Integer pid = Integer.parseInt(s[1]);
        return new Person(fid,pid,s[2]);
    }

    public static void main(String...args){
        TreeSet<Person> friends = new TreeSet<>(new PopularityComp());
        TreeSet<Person> nonFriends = new TreeSet<>(new PopularityComp());
        HashSet<Integer> fset = new HashSet<>();
        List<Person> persons = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //special friends;
        int M = sc.nextInt(); // posts
        sc.nextLine();  // consume next line ..
        // storing special friens...
        while(N > 0){
            fset.add(sc.nextInt());
            N--;
        }
        sc.nextLine(); // consuming second line ....

        while (M > 0){
            persons.add(parsePerson(sc.nextLine().split("\\s")));
            M--;
        }

//        fset.add(1);
//        fset.add(2);
//
//
//        Person one = new Person(1,1,"WHODOESNTLOVECHEFBOK");
//        Person one_two = new Person(1,3,"WHODOESNTLOVECHEFBOK2222");
//        Person two = new Person(2,2,"winteriscoming");
//        Person three = new Person(3,10,"thesevoilentdelights");
//        Person four = new Person(4,3,"comeattheking");

        //Person[] persons = {one,two,three,four,one_two};

        for (Person p:persons) {
              if(fset.contains(p.friendId)){
                  friends.add(p);
              } else {
                  nonFriends.add(p);
              }
        }
         if(!friends.isEmpty()){
             for (Person p:friends
                  ) {
                 System.out.println(p.post);
             }

         }

         if(!nonFriends.isEmpty()){
             for (Person p:nonFriends
                     ) {
                 System.out.println(p.post);
             }
         }

    }
}
