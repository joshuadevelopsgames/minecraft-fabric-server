import java.util.List;

public interface diq<T> {
   public interface a<T> extends diq<T> {
      T a(T var1, List<T> var2);
   }

   public interface b<T> extends diq<T> {
      default T a(jl<dcr> $$0) {
         return this.a(new dcv($$0));
      }

      default T a(dcr $$0) {
         return this.a(new dcv($$0));
      }

      T a(dcv var1);
   }
}
