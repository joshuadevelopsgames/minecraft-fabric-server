import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import io.netty.channel.ChannelHandler;
import io.netty.channel.embedded.EmbeddedChannel;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class sy {
   private final sz a;
   private boolean b;

   public sy(sz $$0) {
      this.a = $$0;
   }

   public sq a(xo $$0) {
      return new sq($$0, this.a.p());
   }

   public sq a(String $$0, Object... $$1) {
      return this.a((xo)xo.b($$0, $$1));
   }

   public sr a(jb $$0, xo $$1) {
      return new sr($$1, this.j($$0), $$0, this.a.p());
   }

   public sr a(jb $$0, String $$1, Object... $$2) {
      return this.a($$0, xo.b($$1, $$2));
   }

   public aub a() {
      return this.a.g();
   }

   public eeb a(jb $$0) {
      return this.a().a_(this.j($$0));
   }

   public <T extends eaz> T a(jb $$0, Class<T> $$1) {
      eaz $$2 = this.a().c_(this.j($$0));
      if ($$2 == null) {
         throw this.a($$0, "test.error.missing_block_entity");
      } else if ($$1.isInstance($$2)) {
         return $$1.cast($$2);
      } else {
         throw this.a($$0, "test.error.wrong_block_entity", $$2.q().a().g());
      }
   }

   public void b() {
      this.a(bzm.class);
   }

   public void a(Class<? extends bzm> $$0) {
      fin $$1 = this.j();
      List<? extends bzm> $$2 = this.a().a($$0, $$1.g(1.0), $$0x -> !($$0x instanceof cut));
      $$2.forEach($$0x -> $$0x.c(this.a()));
   }

   public cqz a(dcr $$0, fis $$1) {
      aub $$2 = this.a();
      fis $$3 = this.a($$1);
      cqz $$4 = new cqz($$2, $$3.d, $$3.e, $$3.f, new dcv($$0, 1));
      $$4.n(0.0, 0.0, 0.0);
      $$2.b($$4);
      return $$4;
   }

   public cqz a(dcr $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fis($$1, $$2, $$3));
   }

   public cqz a(dcr $$0, jb $$1) {
      return this.a($$0, (float)$$1.u(), (float)$$1.v(), (float)$$1.w());
   }

   public <E extends bzm> E a(bzv<E> $$0, jb $$1) {
      return this.a($$0, fis.c($$1));
   }

   public <E extends bzm> E a(bzv<E> $$0, fis $$1) {
      aub $$2 = this.a();
      E $$3 = $$0.a($$2, bzu.d);
      if ($$3 == null) {
         throw this.a(jb.a((jv)$$1), "test.error.spawn_failure", $$0.r().g());
      } else {
         if ($$3 instanceof cao $$4) {
            $$4.gp();
         }

         fis $$5 = this.a($$1);
         $$3.b($$5.d, $$5.e, $$5.f, $$3.dP(), $$3.dR());
         $$2.b($$3);
         return $$3;
      }
   }

   public void a(bzm $$0, byb $$1, float $$2) {
      $$0.a(this.a(), $$1, $$2);
   }

   public void a(bzm $$0) {
      $$0.c(this.a());
   }

   public <E extends bzm> E a(bzv<E> $$0) {
      return this.a($$0, 0, 0, 0, 2.147483647E9);
   }

   public <E extends bzm> E a(bzv<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      List<E> $$5 = this.b($$0, $$1, $$2, $$3, $$4);
      if ($$5.isEmpty()) {
         throw this.a("test.error.expected_entity_around", $$0.h(), $$1, $$2, $$3);
      } else if ($$5.size() > 1) {
         throw this.a("test.error.too_many_entities", $$0.i(), $$1, $$2, $$3, $$5.size());
      } else {
         fis $$6 = this.a(new fis($$1, $$2, $$3));
         $$5.sort(($$1x, $$2x) -> {
            double $$3x = $$1x.dv().f($$6);
            double $$4x = $$2x.dv().f($$6);
            return Double.compare($$3x, $$4x);
         });
         return $$5.get(0);
      }
   }

   public <E extends bzm> List<E> b(bzv<E> $$0, int $$1, int $$2, int $$3, double $$4) {
      return this.a($$0, fis.c(new jb($$1, $$2, $$3)), $$4);
   }

   public <E extends bzm> List<E> a(bzv<E> $$0, fis $$1, double $$2) {
      aub $$3 = this.a();
      fis $$4 = this.a($$1);
      fin $$5 = this.a.e();
      fin $$6 = new fin($$4.b(-$$2, -$$2, -$$2), $$4.b($$2, $$2, $$2));
      return $$3.a($$0, $$5, $$1x -> $$1x.cV().c($$6) && $$1x.bO());
   }

   public <E extends bzm> E a(bzv<E> $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, new jb($$1, $$2, $$3));
   }

   public <E extends bzm> E a(bzv<E> $$0, float $$1, float $$2, float $$3) {
      return this.a($$0, new fis($$1, $$2, $$3));
   }

   public <E extends cao> E b(bzv<E> $$0, jb $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gC();
      return $$2;
   }

   public <E extends cao> E b(bzv<E> $$0, int $$1, int $$2, int $$3) {
      return this.b($$0, new jb($$1, $$2, $$3));
   }

   public <E extends cao> E b(bzv<E> $$0, fis $$1) {
      E $$2 = (E)this.a($$0, $$1);
      $$2.gC();
      return $$2;
   }

   public <E extends cao> E b(bzv<E> $$0, float $$1, float $$2, float $$3) {
      return this.b($$0, new fis($$1, $$2, $$3));
   }

   public void a(cao $$0, float $$1, float $$2, float $$3) {
      fis $$4 = this.a(new fis($$1, $$2, $$3));
      $$0.b($$4.d, $$4.e, $$4.f, $$0.dP(), $$0.dR());
   }

   public tf a(cao $$0, jb $$1, float $$2) {
      return this.g().a(2, () -> {
         faz $$3 = $$0.S().a(this.j($$1), 0);
         $$0.S().a($$3, (double)$$2);
      });
   }

   public void a(int $$0, int $$1, int $$2) {
      this.b(new jb($$0, $$1, $$2));
   }

   public void b(jb $$0) {
      this.a(azo.f, $$0);
      jb $$1 = this.j($$0);
      eeb $$2 = this.a().a_($$1);
      dqk $$3 = (dqk)$$2.b();
      $$3.a($$2, this.a(), $$1, null);
   }

   public void c(jb $$0) {
      this.a($$0, this.a(dmr.b));
   }

   public void a(jb $$0, cut $$1) {
      jb $$2 = this.j($$0);
      this.a($$0, $$1, new fio(fis.b($$2), jh.c, $$2, true));
   }

   public void a(jb $$0, cut $$1, fio $$2) {
      jb $$3 = this.j($$0);
      eeb $$4 = this.a().a_($$3);
      bxi $$5 = bxi.a;
      bxj $$6 = $$4.a($$1.b($$5), this.a(), $$1, $$5, $$2);
      if (!$$6.a()) {
         if (!($$6 instanceof bxj.f) || !$$4.a(this.a(), $$1, $$2).a()) {
            dgq $$7 = new dgq($$1, $$5, $$2);
            $$1.b($$5).a($$7);
         }
      }
   }

   public cam a(cam $$0) {
      $$0.j(0);
      $$0.x(0.25F);
      return $$0;
   }

   public cam b(cam $$0) {
      $$0.x(0.25F);
      return $$0;
   }

   public cut a(final dmr $$0) {
      return new cut(this.a(), new GameProfile(UUID.randomUUID(), "test-mock-player")) {
         @Nonnull
         @Override
         public dmr a() {
            return $$0;
         }

         @Override
         public boolean aa_() {
            return false;
         }
      };
   }

   @Deprecated(
      forRemoval = true
   )
   public auc c() {
      aur $$0 = aur.a(new GameProfile(UUID.randomUUID(), "test-mock-player"), false);
      auc $$1 = new auc(this.a().q(), this.a(), $$0.a(), $$0.c()) {
         @Override
         public dmr a() {
            return dmr.b;
         }
      };
      wd $$2 = new wd(zx.a);
      new EmbeddedChannel(new ChannelHandler[]{$$2});
      this.a().q().ag().a($$2, $$1, $$0);
      return $$1;
   }

   public void b(int $$0, int $$1, int $$2) {
      this.d(new jb($$0, $$1, $$2));
   }

   public void d(jb $$0) {
      this.a(dqb.dL, $$0);
      jb $$1 = this.j($$0);
      eeb $$2 = this.a().a_($$1);
      dut $$3 = (dut)$$2.b();
      $$3.b($$2, this.a(), $$1, null);
   }

   public void a(jb $$0, long $$1) {
      this.a($$0, dqb.hB);
      this.b($$1, () -> this.a($$0, dqb.a));
   }

   public void e(jb $$0) {
      this.a().a(this.j($$0), false, null);
   }

   public void a(int $$0, int $$1, int $$2, dpz $$3) {
      this.a(new jb($$0, $$1, $$2), $$3);
   }

   public void a(int $$0, int $$1, int $$2, eeb $$3) {
      this.a(new jb($$0, $$1, $$2), $$3);
   }

   public void a(jb $$0, dpz $$1) {
      this.a($$0, $$1.m());
   }

   public void a(jb $$0, eeb $$1) {
      this.a().a(this.j($$0), $$1, 3);
   }

   public void d() {
      this.a(13000);
   }

   public void a(int $$0) {
      this.a().b((long)$$0);
   }

   public void a(dpz $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jb($$1, $$2, $$3));
   }

   public void a(dpz $$0, jb $$1) {
      eeb $$2 = this.a($$1);
      this.a($$1, $$2x -> $$2.a($$0), $$1x -> xo.a("test.error.expected_block", $$0.f(), $$1x.f()));
   }

   public void b(dpz $$0, int $$1, int $$2, int $$3) {
      this.b($$0, new jb($$1, $$2, $$3));
   }

   public void b(dpz $$0, jb $$1) {
      this.a($$1, $$2 -> !this.a($$1).a($$0), $$1x -> xo.a("test.error.unexpected_block", $$0.f()));
   }

   public void a(bae<dpz> $$0, jb $$1) {
      this.b($$1, $$1x -> $$1x.a($$0), $$1x -> xo.a("test.error.expected_block_tag", xo.a($$0.b()), $$1x.b().f()));
   }

   public void c(dpz $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jb($$1, $$2, $$3));
   }

   public void c(dpz $$0, jb $$1) {
      this.b(() -> this.a($$0, $$1));
   }

   public void a(jb $$0, Predicate<dpz> $$1, Function<dpz, xo> $$2) {
      this.b($$0, $$1x -> $$1.test($$1x.b()), $$1x -> $$2.apply($$1x.b()));
   }

   public <T extends Comparable<T>> void a(jb $$0, efe<T> $$1, T $$2) {
      eeb $$3 = this.a($$0);
      boolean $$4 = $$3.b($$1);
      if (!$$4) {
         throw this.a($$0, "test.error.block_property_missing", $$1.f(), $$2);
      } else if (!$$3.<T>c($$1).equals($$2)) {
         throw this.a($$0, "test.error.block_property_mismatch", $$1.f(), $$2, $$3.c($$1));
      }
   }

   public <T extends Comparable<T>> void a(jb $$0, efe<T> $$1, Predicate<T> $$2, xo $$3) {
      this.b($$0, $$2x -> {
         if (!$$2x.b($$1)) {
            return false;
         } else {
            T $$3x = $$2x.c($$1);
            return $$2.test($$3x);
         }
      }, $$1x -> $$3);
   }

   public void b(jb $$0, eeb $$1) {
      eeb $$2 = this.a($$0);
      if (!$$2.equals($$1)) {
         throw this.a($$0, "test.error.state_not_equal", $$1, $$2);
      }
   }

   public void b(jb $$0, Predicate<eeb> $$1, Function<eeb, xo> $$2) {
      eeb $$3 = this.a($$0);
      if (!$$1.test($$3)) {
         throw this.a($$0, $$2.apply($$3));
      }
   }

   public <T extends eaz> void a(jb $$0, Class<T> $$1, Predicate<T> $$2, Supplier<xo> $$3) {
      T $$4 = this.a($$0, $$1);
      if (!$$2.test($$4)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void a(jb $$0, jh $$1, IntPredicate $$2, Supplier<xo> $$3) {
      jb $$4 = this.j($$0);
      aub $$5 = this.a();
      eeb $$6 = $$5.a_($$4);
      int $$7 = $$6.a($$5, $$4, $$1);
      if (!$$2.test($$7)) {
         throw this.a($$0, $$3.get());
      }
   }

   public void b(bzv<?> $$0) {
      List<? extends bzm> $$1 = this.a().a($$0, this.j(), bzm::bO);
      if ($$1.isEmpty()) {
         throw this.a("test.error.expected_entity_in_test", $$0.h());
      }
   }

   public void c(bzv<?> $$0, int $$1, int $$2, int $$3) {
      this.c($$0, new jb($$1, $$2, $$3));
   }

   public void c(bzv<?> $$0, jb $$1) {
      jb $$2 = this.j($$1);
      List<? extends bzm> $$3 = this.a().a($$0, new fin($$2), bzm::bO);
      if ($$3.isEmpty()) {
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bzv<?> $$0, fin $$1) {
      fin $$2 = this.a($$1);
      List<? extends bzm> $$3 = this.a().a($$0, $$2, bzm::bO);
      if ($$3.isEmpty()) {
         throw this.a(jb.a((jv)$$1.f()), "test.error.expected_entity", $$0.h());
      }
   }

   public void a(bzv<?> $$0, int $$1) {
      List<? extends bzm> $$2 = this.a().a($$0, this.j(), bzm::bO);
      if ($$2.size() != $$1) {
         throw this.a("test.error.expected_entity_count", $$1, $$0.h(), $$2.size());
      }
   }

   public void a(bzv<?> $$0, jb $$1, int $$2, double $$3) {
      jb $$4 = this.j($$1);
      List<? extends bzm> $$5 = this.b((bzv<? extends bzm>)$$0, $$1, $$3);
      if ($$5.size() != $$2) {
         throw this.a($$1, "test.error.expected_entity_count", $$2, $$0.h(), $$5.size());
      }
   }

   public void a(bzv<?> $$0, jb $$1, double $$2) {
      List<? extends bzm> $$3 = this.b((bzv<? extends bzm>)$$0, $$1, $$2);
      if ($$3.isEmpty()) {
         jb $$4 = this.j($$1);
         throw this.a($$1, "test.error.expected_entity", $$0.h());
      }
   }

   public <T extends bzm> List<T> b(bzv<T> $$0, jb $$1, double $$2) {
      jb $$3 = this.j($$1);
      return this.a().a($$0, new fin($$3).g($$2), bzm::bO);
   }

   public <T extends bzm> List<T> c(bzv<T> $$0) {
      return this.a().a($$0, this.j(), bzm::bO);
   }

   public void a(bzm $$0, int $$1, int $$2, int $$3) {
      this.a($$0, new jb($$1, $$2, $$3));
   }

   public void a(bzm $$0, jb $$1) {
      jb $$2 = this.j($$1);
      List<? extends bzm> $$3 = this.a().a($$0.ap(), new fin($$2), bzm::bO);
      $$3.stream().filter($$1x -> $$1x == $$0).findFirst().orElseThrow(() -> this.a($$1, "test.error.expected_entity", $$0.ap().h()));
   }

   public void a(dcr $$0, jb $$1, double $$2, int $$3) {
      jb $$4 = this.j($$1);
      List<cqz> $$5 = this.a().a(bzv.as, new fin($$4).g($$2), bzm::bO);
      int $$6 = 0;

      for (cqz $$7 : $$5) {
         dcv $$8 = $$7.e();
         if ($$8.a($$0)) {
            $$6 += $$8.M();
         }
      }

      if ($$6 != $$3) {
         throw this.a($$1, "test.error.expected_items_count", $$3, $$0.l(), $$6);
      }
   }

   public void a(dcr $$0, jb $$1, double $$2) {
      jb $$3 = this.j($$1);

      for (bzm $$5 : this.a().a(bzv.as, new fin($$3).g($$2), bzm::bO)) {
         cqz $$6 = (cqz)$$5;
         if ($$6.e().h().equals($$0)) {
            return;
         }
      }

      throw this.a($$1, "test.error.expected_item", $$0.l());
   }

   public void b(dcr $$0, jb $$1, double $$2) {
      jb $$3 = this.j($$1);

      for (bzm $$5 : this.a().a(bzv.as, new fin($$3).g($$2), bzm::bO)) {
         cqz $$6 = (cqz)$$5;
         if ($$6.e().h().equals($$0)) {
            throw this.a($$1, "test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void a(dcr $$0) {
      for (bzm $$2 : this.a().a(bzv.as, this.j(), bzm::bO)) {
         cqz $$3 = (cqz)$$2;
         if ($$3.e().h().equals($$0)) {
            return;
         }
      }

      throw this.a("test.error.expected_item", $$0.l());
   }

   public void b(dcr $$0) {
      for (bzm $$2 : this.a().a(bzv.as, this.j(), bzm::bO)) {
         cqz $$3 = (cqz)$$2;
         if ($$3.e().h().equals($$0)) {
            throw this.a("test.error.unexpected_item", $$0.l());
         }
      }
   }

   public void d(bzv<?> $$0) {
      List<? extends bzm> $$1 = this.a().a($$0, this.j(), bzm::bO);
      if (!$$1.isEmpty()) {
         throw this.a($$1.getFirst().dx(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void d(bzv<?> $$0, int $$1, int $$2, int $$3) {
      this.d($$0, new jb($$1, $$2, $$3));
   }

   public void d(bzv<?> $$0, jb $$1) {
      jb $$2 = this.j($$1);
      List<? extends bzm> $$3 = this.a().a($$0, new fin($$2), bzm::bO);
      if (!$$3.isEmpty()) {
         throw this.a($$1, "test.error.unexpected_entity", $$0.h());
      }
   }

   public void b(bzv<?> $$0, fin $$1) {
      fin $$2 = this.a($$1);
      List<? extends bzm> $$3 = this.a().a($$0, $$2, bzm::bO);
      if (!$$3.isEmpty()) {
         throw this.a($$3.getFirst().dx(), "test.error.unexpected_entity", $$0.h());
      }
   }

   public void a(bzv<?> $$0, double $$1, double $$2, double $$3) {
      fis $$4 = new fis($$1, $$2, $$3);
      fis $$5 = this.a($$4);
      Predicate<? super bzm> $$6 = $$1x -> $$1x.cV().a($$5, $$5);
      List<? extends bzm> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public void b(bzv<?> $$0, double $$1, double $$2, double $$3) {
      fis $$4 = new fis($$1, $$2, $$3);
      fis $$5 = this.a($$4);
      Predicate<? super bzm> $$6 = $$1x -> !$$1x.cV().a($$5, $$5);
      List<? extends bzm> $$7 = this.a().a($$0, this.j(), $$6);
      if ($$7.isEmpty()) {
         throw this.a("test.error.expected_entity_not_touching", $$0.h(), $$5.a(), $$5.b(), $$5.c(), $$1, $$2, $$3);
      }
   }

   public <E extends bzm, T> void a(jb $$0, bzv<E> $$1, Predicate<E> $$2) {
      jb $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fin($$3), bzm::bO);
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if (!$$2.test($$5)) {
               throw this.a($$5.dx(), "test.error.expected_entity_data_predicate", $$5.aj());
            }
         }
      }
   }

   public <E extends bzm, T> void a(jb $$0, bzv<E> $$1, Function<? super E, T> $$2, @Nullable T $$3) {
      jb $$4 = this.j($$0);
      List<E> $$5 = this.a().a($$1, new fin($$4), bzm::bO);
      if ($$5.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$6 : $$5) {
            T $$7 = $$2.apply($$6);
            if (!Objects.equals($$7, $$3)) {
               throw this.a($$0, "test.error.expected_entity_data", $$3, $$7);
            }
         }
      }
   }

   public <E extends cam> void a(jb $$0, bzv<E> $$1, dcr $$2) {
      jb $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fin($$3), bzm::bO);
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.b($$2)) {
               return;
            }
         }

         throw this.a($$0, "test.error.expected_entity_holding", $$2.l());
      }
   }

   public <E extends bzm & cud> void b(jb $$0, bzv<E> $$1, dcr $$2) {
      jb $$3 = this.j($$0);
      List<E> $$4 = this.a().a($$1, new fin($$3), $$0x -> ((bzm)$$0x).bO());
      if ($$4.isEmpty()) {
         throw this.a($$0, "test.error.expected_entity", $$1.h());
      } else {
         for (E $$5 : $$4) {
            if ($$5.n().a_($$1x -> $$1x.a($$2))) {
               return;
            }
         }

         throw this.a($$0, "test.error.expected_entity_having", $$2.l());
      }
   }

   public void f(jb $$0) {
      eas $$1 = this.a($$0, eas.class);
      if (!$$1.c()) {
         throw this.a($$0, "test.error.expected_empty_container");
      }
   }

   public void a(jb $$0, dcr $$1) {
      eas $$2 = this.a($$0, eas.class);
      if ($$2.a_($$1) != 1) {
         throw this.a($$0, "test.error.expected_container_contents_single", $$1.l());
      }
   }

   public void b(jb $$0, dcr $$1) {
      eas $$2 = this.a($$0, eas.class);
      if ($$2.a_($$1) == 0) {
         throw this.a($$0, "test.error.expected_container_contents", $$1.l());
      }
   }

   public void a(euq $$0, jb $$1) {
      jb.a($$0).forEach($$2 -> {
         jb $$3 = $$1.b($$2.u() - $$0.h(), $$2.v() - $$0.i(), $$2.w() - $$0.j());
         this.a($$2, $$3);
      });
   }

   public void a(jb $$0, jb $$1) {
      eeb $$2 = this.a($$0);
      eeb $$3 = this.a($$1);
      if ($$2 != $$3) {
         throw this.a($$0, "test.error.state_not_equal", $$3, $$2);
      }
   }

   public void a(long $$0, jb $$1, dcr $$2) {
      this.a($$0, () -> this.a($$1, $$2));
   }

   public void a(long $$0, jb $$1) {
      this.a($$0, () -> this.f($$1));
   }

   public <E extends bzm, T> void b(jb $$0, bzv<E> $$1, Function<E, T> $$2, T $$3) {
      this.b(() -> this.a($$0, $$1, $$2, $$3));
   }

   public void a(bzm $$0, fin $$1, xo $$2) {
      if (!$$1.d(this.b($$0.dv()))) {
         throw this.a($$2);
      }
   }

   public <E extends bzm> void a(E $$0, Predicate<E> $$1, xo $$2) {
      if (!$$1.test($$0)) {
         throw this.a($$0.dx(), "test.error.entity_property", $$0.aj(), $$2);
      }
   }

   public <E extends bzm, T> void a(E $$0, Function<E, T> $$1, T $$2, xo $$3) {
      T $$4 = $$1.apply($$0);
      if (!$$4.equals($$2)) {
         throw this.a($$0.dx(), "test.error.entity_property_details", $$0.aj(), $$3, $$4, $$2);
      }
   }

   public void a(cam $$0, jl<byo> $$1, int $$2) {
      byq $$3 = $$0.e($$1);
      if ($$3 == null || $$3.e() != $$2) {
         throw this.a("test.error.expected_entity_effect", $$0.aj(), der.a($$1, $$2));
      }
   }

   public void e(bzv<?> $$0, int $$1, int $$2, int $$3) {
      this.e($$0, new jb($$1, $$2, $$3));
   }

   public void e(bzv<?> $$0, jb $$1) {
      this.b(() -> this.c($$0, $$1));
   }

   public void f(bzv<?> $$0, int $$1, int $$2, int $$3) {
      this.f($$0, new jb($$1, $$2, $$3));
   }

   public void f(bzv<?> $$0, jb $$1) {
      this.b(() -> this.d($$0, $$1));
   }

   public void e() {
      this.a.m();
   }

   private void k() {
      if (this.b) {
         throw new IllegalStateException("This test already has final clause");
      } else {
         this.b = true;
      }
   }

   public void a(Runnable $$0) {
      this.k();
      this.a.q().a(0L, $$0).a();
   }

   public void b(Runnable $$0) {
      this.k();
      this.a.q().a($$0).a();
   }

   public void a(int $$0, Runnable $$1) {
      this.k();
      this.a.q().a((long)$$0, $$1).a();
   }

   public void a(long $$0, Runnable $$1) {
      this.a.a($$0, $$1);
   }

   public void b(long $$0, Runnable $$1) {
      this.a(this.a.p() + $$0, $$1);
   }

   public void g(jb $$0) {
      jb $$1 = this.j($$0);
      aub $$2 = this.a();
      $$2.a_($$1).b($$2, $$1, $$2.A);
   }

   public void h(jb $$0) {
      jb $$1 = this.j($$0);
      aub $$2 = this.a();
      $$2.a_($$1).a($$2, $$1, $$2.A);
   }

   public void i(jb $$0) {
      jb $$1 = this.j($$0);
      aub $$2 = this.a();
      $$2.a($$1);
   }

   public void f() {
      fin $$0 = this.l();
      int $$1 = (int)Math.floor($$0.d);
      int $$2 = (int)Math.floor($$0.f);
      int $$3 = (int)Math.floor($$0.e);

      for (int $$4 = (int)Math.floor($$0.a); $$4 < $$1; $$4++) {
         for (int $$5 = (int)Math.floor($$0.c); $$5 < $$2; $$5++) {
            this.i(new jb($$4, $$3, $$5));
         }
      }
   }

   public int a(eka.a $$0, int $$1, int $$2) {
      jb $$3 = this.j(new jb($$1, 0, $$2));
      return this.k(this.a().a($$0, $$3)).v();
   }

   public void a(xo $$0, jb $$1) {
      throw this.a($$1, $$0);
   }

   public void a(xo $$0, bzm $$1) {
      throw this.a($$1.dx(), $$0);
   }

   public void b(xo $$0) {
      throw this.a($$0);
   }

   public void c(Runnable $$0) {
      this.a.q().a($$0).a(() -> this.a("test.error.fail"));
   }

   public void d(Runnable $$0) {
      LongStream.range(this.a.p(), this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public tf g() {
      return this.a.q();
   }

   public jb j(jb $$0) {
      jb $$1 = this.a.d();
      jb $$2 = $$1.a((kg)$$0);
      return eza.a($$2, dvd.a, this.a.u(), $$1);
   }

   public jb k(jb $$0) {
      jb $$1 = this.a.d();
      dwu $$2 = this.a.u().a(dwu.c);
      jb $$3 = eza.a($$0, dvd.a, $$2, $$1);
      return $$3.b($$1);
   }

   public fin a(fin $$0) {
      fis $$1 = this.a($$0.h());
      fis $$2 = this.a($$0.i());
      return new fin($$1, $$2);
   }

   public fin b(fin $$0) {
      fis $$1 = this.b($$0.h());
      fis $$2 = this.b($$0.i());
      return new fin($$1, $$2);
   }

   public fis a(fis $$0) {
      fis $$1 = fis.a(this.a.d());
      return eza.a($$1.e($$0), dvd.a, this.a.u(), this.a.d());
   }

   public fis b(fis $$0) {
      fis $$1 = fis.a(this.a.d());
      return eza.a($$0.d($$1), dvd.a, this.a.u(), this.a.d());
   }

   public dwu h() {
      return this.a.u();
   }

   public void a(boolean $$0, xo $$1) {
      if (!$$0) {
         throw this.a($$1);
      }
   }

   public <N> void a(N $$0, N $$1, xo $$2) {
      if (!$$0.equals($$1)) {
         throw this.a("test.error.value_not_equal", $$2, $$0, $$1);
      }
   }

   public void b(boolean $$0, xo $$1) {
      this.a(!$$0, $$1);
   }

   public long i() {
      return this.a.p();
   }

   public fin j() {
      return this.a.e();
   }

   private fin l() {
      fin $$0 = this.a.e();
      dwu $$1 = this.a.u();
      switch ($$1) {
         case d:
         case b:
            return new fin(0.0, 0.0, 0.0, $$0.d(), $$0.c(), $$0.b());
         default:
            return new fin(0.0, 0.0, 0.0, $$0.b(), $$0.c(), $$0.d());
      }
   }

   public void a(Consumer<jb> $$0) {
      fin $$1 = this.l().a(1.0, 1.0, 1.0);
      jb.a.b($$1).forEach($$0);
   }

   public void e(Runnable $$0) {
      LongStream.range(this.a.p(), this.a.x()).forEach($$1 -> this.a.a($$1, $$0::run));
   }

   public void a(cut $$0, dcv $$1, jb $$2, jh $$3) {
      jb $$4 = this.j($$2.a($$3));
      fio $$5 = new fio(fis.b($$4), $$3, $$4, false);
      dgq $$6 = new dgq($$0, bxi.a, $$5);
      $$1.a($$6);
   }

   public void a(amd<dnx> $$0) {
      fin $$1 = this.j();
      jb $$2 = jb.a($$1.a, $$1.b, $$1.c);
      jb $$3 = jb.a($$1.d, $$1.e, $$1.f);
      Either<Integer, CommandSyntaxException> $$4 = aok.a(this.a(), $$2, $$3, this.a().K_().f(mn.aK).b($$0));
      if ($$4.right().isPresent()) {
         throw this.a("test.error.set_biome");
      }
   }
}
