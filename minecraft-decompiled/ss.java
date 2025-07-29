import java.util.Collection;

public record ss(int a, Collection<sz> b, jl<tu> c) {
   public ss(int a, Collection<sz> b, jl<tu> c) {
      if (b.isEmpty()) {
         throw new IllegalArgumentException("A GameTestBatch must include at least one GameTestInfo!");
      } else {
         this.a = a;
         this.b = b;
         this.c = c;
      }
   }
}
