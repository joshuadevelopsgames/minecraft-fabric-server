import javax.annotation.Nullable;

public class cje<T extends cam> extends cjb<T> {
   private final cbi i;

   public cje(cbi $$0, Class<T> $$1, boolean $$2, @Nullable clc.a $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean b() {
      return !this.i.m() && super.b();
   }

   @Override
   public boolean c() {
      return this.d != null ? this.d.a(a(this.e), this.e, this.c) : super.c();
   }
}
