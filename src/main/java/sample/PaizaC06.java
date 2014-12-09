package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PaizaC06 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        try (Scanner scan = new Scanner(System.in)) {

            int paramNum = scan.nextInt();
            int userNum  = scan.nextInt();
            int top = scan.nextInt();

            List<Item> items = IntStream.range(0, paramNum)
                                        .mapToObj( x -> new Item(scan.nextDouble()))
                                        .collect(Collectors.toList());

            IntStream.range(0, userNum)
                     .mapToObj(x -> createUser(scan, items))
                     .sorted()
                     .limit(top)
                     .forEach(user -> System.out.println(user.getTotalScore()));


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static User createUser(Scanner scan, List<Item> items){

        User user = new User();

        IntStream.range(0,  items.size())
                .mapToObj(x -> items.get(x).create(scan.nextInt()))
                .forEach( item -> user.addItems(item));

        return user;
    }

    static class User implements Comparable<User> {

        private List<Item> items = new ArrayList<>();

        public boolean addItems(Item item) {
            return this.items.add(item);
        }

        public Long getTotalScore(){

            double total = 0;

            for(Item item :items){
                total += item.getScore();
            }
            return Math.round(total);
        }

        @Override
        public int compareTo(User o) {
            return - getTotalScore().compareTo(o.getTotalScore()) ;
        }
    }

    static class Item implements Cloneable {

        private Double point;
        private Integer count;

        public Item(Double point) {
            this.point = point;
        }

        public Double getPoint() {
            return point;
        }

        public void setPoint(Double point) {
            this.point = point;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Double getScore() {
            return point * count;
        }

        public Item create(int count){
            try {
                Item i = (Item)this.clone();
                i.setCount(count);
                return i;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
