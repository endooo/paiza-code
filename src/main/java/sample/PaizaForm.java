package sample;
import java.util.Scanner;

public class PaizaForm {

	public static void main (String[] args) {

	    try(Scanner scanner = new Scanner(System.in)){
            System.out.println(scanner.next());
        }catch(Exception e){
            e.printStackTrace();
        }
	}

	/*
    public static class Pair<T, U> {
        T left;
        U right;

        public Pair(T left, U right) {
            this.left = left;
            this.right = right;
        }

        public static <M, N> Pair<M, N> of(M left, N right){
            return new Pair<>(left, right);
        }
        public<R> R reduce(BiFunction<T, U, R> func){
            return func.apply(left, right);
        }
        public<M, N> Pair<M, N> map(Function<T, M> lfunc, Function<U, N> rfunc){
            return of(lfunc.apply(left), rfunc.apply(right));
        }
    }

    public static <T, U> Stream<Pair<T,U>> zip(Stream<T> f, Stream<U> s){
        Iterator<T> fite = f.iterator();
        Iterator<U> site = s.iterator();
        Iterator<Pair<T, U>> iterator = new Iterator<Pair<T, U>>(){
            @Override
            public boolean hasNext() {
                return fite.hasNext() && site.hasNext();
            }
            @Override
            public Pair<T, U> next() {
                return Pair.of(fite.next(), site.next());
            }
        };

        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(
                        iterator, Spliterator.NONNULL | Spliterator.ORDERED), false);
    }
    */
}
