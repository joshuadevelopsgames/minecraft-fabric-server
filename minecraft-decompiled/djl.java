public record djl(jl<dji> a, int b) {
   public int a() {
      return this.b().a().b();
   }

   public jl<dji> b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }
}
