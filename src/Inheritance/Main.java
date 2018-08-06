package Inheritance;

public class Main {

    public static void main(String args[]){

        Insect insect = new Insect(23,8);
        Spider spider = new Spider(2,true);
        Cricket cricket = new Cricket(44,4.3);

        insect.says();
        insect.crawl();

        spider.says();
        spider.crawl();

        cricket.says();
        cricket.crawl();



    }
}
