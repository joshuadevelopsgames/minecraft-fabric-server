public record flk(fis b, fis c, fis d) {
   public static final flk a = new flk(fis.c, new fis(0.0, 0.0, -1.0), new fis(0.0, 1.0, 0.0));

   public fis a() {
      return this.c.c(this.d);
   }
}
