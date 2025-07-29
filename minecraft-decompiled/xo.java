import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.datafixers.util.Either;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface xo extends Message, xt {
   yl a();

   xp b();

   @Override
   default String getString() {
      return xt.super.getString();
   }

   default String a(int $$0) {
      StringBuilder $$1 = new StringBuilder();
      this.a((xt.a)($$2 -> {
         int $$3 = $$0 - $$1.length();
         if ($$3 <= 0) {
            return a;
         } else {
            $$1.append($$2.length() <= $$3 ? $$2 : $$2.substring(0, $$3));
            return Optional.empty();
         }
      }));
      return $$1.toString();
   }

   List<xo> c();

   @Nullable
   default String d() {
      return this.b() instanceof yv $$0 && this.c().isEmpty() && this.a().h() ? $$0.b() : null;
   }

   default yc e() {
      return yc.a(this.b());
   }

   default yc f() {
      return new yc(this.b(), new ArrayList<>(this.c()), this.a());
   }

   bbm g();

   @Override
   default <T> Optional<T> a(xt.b<T> $$0, yl $$1) {
      yl $$2 = this.a().a($$1);
      Optional<T> $$3 = this.b().a($$0, $$2);
      if ($$3.isPresent()) {
         return $$3;
      } else {
         for (xo $$4 : this.c()) {
            Optional<T> $$5 = $$4.a($$0, $$2);
            if ($$5.isPresent()) {
               return $$5;
            }
         }

         return Optional.empty();
      }
   }

   @Override
   default <T> Optional<T> a(xt.a<T> $$0) {
      Optional<T> $$1 = this.b().a($$0);
      if ($$1.isPresent()) {
         return $$1;
      } else {
         for (xo $$2 : this.c()) {
            Optional<T> $$3 = $$2.a($$0);
            if ($$3.isPresent()) {
               return $$3;
            }
         }

         return Optional.empty();
      }
   }

   default List<xo> h() {
      return this.a(yl.a);
   }

   default List<xo> a(yl $$0) {
      List<xo> $$1 = Lists.newArrayList();
      this.a(($$1x, $$2) -> {
         if (!$$2.isEmpty()) {
            $$1.add(b($$2).c($$1x));
         }

         return Optional.empty();
      }, $$0);
      return $$1;
   }

   default boolean a(xo $$0) {
      if (this.equals($$0)) {
         return true;
      } else {
         List<xo> $$1 = this.h();
         List<xo> $$2 = $$0.a(this.a());
         return Collections.indexOfSubList($$1, $$2) != -1;
      }
   }

   static xo a(@Nullable String $$0) {
      return (xo)($$0 != null ? b($$0) : xn.a);
   }

   static yc b(String $$0) {
      return yc.a(yv.a($$0));
   }

   static yc c(String $$0) {
      return yc.a(new yz($$0, null, yz.a));
   }

   static yc a(String $$0, Object... $$1) {
      return yc.a(new yz($$0, null, $$1));
   }

   static yc b(String $$0, Object... $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         Object $$3 = $$1[$$2];
         if (!yz.a($$3) && !($$3 instanceof xo)) {
            $$1[$$2] = String.valueOf($$3);
         }
      }

      return a($$0, $$1);
   }

   static yc a(String $$0, @Nullable String $$1) {
      return yc.a(new yz($$0, $$1, yz.a));
   }

   static yc a(String $$0, @Nullable String $$1, Object... $$2) {
      return yc.a(new yz($$0, $$1, $$2));
   }

   static yc i() {
      return yc.a(yv.c);
   }

   static yc d(String $$0) {
      return yc.a(new ys($$0));
   }

   static yc a(String $$0, boolean $$1, Optional<xo> $$2, yq $$3) {
      return yc.a(new yu($$0, $$1, $$2, $$3));
   }

   static yc a(hf $$0, String $$1) {
      return yc.a(new yw(Either.left($$0), $$1));
   }

   static yc b(String $$0, String $$1) {
      return yc.a(new yw(Either.right($$0), $$1));
   }

   static yc a(hf $$0, Optional<xo> $$1) {
      return yc.a(new yx($$0, $$1));
   }

   static xo a(Date $$0) {
      return b($$0.toString());
   }

   static xo a(Message $$0) {
      return (xo)($$0 instanceof xo $$1 ? $$1 : b($$0.getString()));
   }

   static xo a(UUID $$0) {
      return b($$0.toString());
   }

   static xo a(ame $$0) {
      return b($$0.toString());
   }

   static xo a(dlz $$0) {
      return b($$0.toString());
   }

   static xo a(URI $$0) {
      return b($$0.toString());
   }
}
