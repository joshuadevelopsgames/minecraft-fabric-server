import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dmv extends dmf, dnb, dnj {
   @Override
   default long am() {
      return this.D_().d();
   }

   long J_();

   @Override
   default <T> fkk<T> a(jb $$0, T $$1, int $$2, fko $$3) {
      return new fkk<>($$1, $$0, this.D_().c() + $$2, $$3, this.J_());
   }

   @Override
   default <T> fkk<T> a(jb $$0, T $$1, int $$2) {
      return new fkk<>($$1, $$0, this.D_().c() + $$2, this.J_());
   }

   fco D_();

   bxh d_(jb var1);

   @Nullable
   MinecraftServer q();

   default bxg an() {
      return this.D_().q();
   }

   egc T();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.T().b($$0, $$1);
   }

   bck H_();

   default void a(jb $$0, dpz $$1) {
   }

   default void a(jh $$0, jb $$1, jb $$2, eeb $$3, int $$4, int $$5) {
      fbs.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bzm $$0, jb $$1, ayy $$2, aza $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bzm var1, jb var2, ayy var3, aza var4, float var5, float var6);

   void a(mc var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bzm var1, int var2, jb var3, int var4);

   default void c(int $$0, jb $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jl<ejb> var1, fis var2, ejb.a var3);

   default void a(@Nullable bzm $$0, jl<ejb> $$1, fis $$2) {
      this.a($$1, $$2, new ejb.a($$0, null));
   }

   default void a(@Nullable bzm $$0, jl<ejb> $$1, jb $$2) {
      this.a($$1, $$2, new ejb.a($$0, null));
   }

   default void a(jl<ejb> $$0, jb $$1, ejb.a $$2) {
      this.a($$0, fis.b($$1), $$2);
   }

   default void a(amd<ejb> $$0, jb $$1, ejb.a $$2) {
      this.a(this.K_().f(mn.J).b($$0), $$1, $$2);
   }
}
