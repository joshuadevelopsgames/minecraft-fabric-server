import java.util.function.Consumer;

public class gbk implements gbl {
   public static final int a = 33;
   private static final int b = 30;
   private final gbi c = new gbi();
   private final gbi d = new gbi();
   private final gbi e = new gbi();
   private final get f;
   private int g;
   private int h;

   public gbk(get $$0) {
      this($$0, 33);
   }

   public gbk(get $$0, int $$1) {
      this($$0, $$1, $$1);
   }

   public gbk(get $$0, int $$1, int $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.c.c().a(0.5F, 0.5F);
      this.d.c().a(0.5F, 0.5F);
   }

   @Override
   public void j(int $$0) {
   }

   @Override
   public void k(int $$0) {
   }

   @Override
   public int E() {
      return 0;
   }

   @Override
   public int F() {
      return 0;
   }

   @Override
   public int z() {
      return this.f.o;
   }

   @Override
   public int y() {
      return this.f.p;
   }

   public int b() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void b(int $$0) {
      this.g = $$0;
   }

   public int c() {
      return this.g;
   }

   public int d() {
      return this.f.p - this.c() - this.b();
   }

   @Override
   public void b(Consumer<gbm> $$0) {
      this.c.b($$0);
      this.e.b($$0);
      this.d.b($$0);
   }

   @Override
   public void a() {
      int $$0 = this.c();
      int $$1 = this.b();
      this.c.b(this.f.o);
      this.c.a($$0);
      this.c.c(0, 0);
      this.c.a();
      this.d.b(this.f.o);
      this.d.a($$1);
      this.d.a();
      this.d.k(this.f.p - $$1);
      this.e.b(this.f.o);
      this.e.a();
      int $$2 = $$0 + 30;
      int $$3 = this.f.p - $$1 - this.e.y();
      this.e.c(0, Math.min($$2, $$3));
   }

   public <T extends gbm> T a(T $$0) {
      return this.c.a($$0);
   }

   public <T extends gbm> T a(T $$0, Consumer<gbn> $$1) {
      return this.c.a($$0, $$1);
   }

   public void a(xo $$0, fwz $$1) {
      this.c.a(new fyx($$0, $$1));
   }

   public <T extends gbm> T b(T $$0) {
      return this.d.a($$0);
   }

   public <T extends gbm> T b(T $$0, Consumer<gbn> $$1) {
      return this.d.a($$0, $$1);
   }

   public <T extends gbm> T c(T $$0) {
      return this.e.a($$0);
   }

   public <T extends gbm> T c(T $$0, Consumer<gbn> $$1) {
      return this.e.a($$0, $$1);
   }
}
