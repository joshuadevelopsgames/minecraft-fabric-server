import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class atx extends bwz {
   private final Set<auc> h = Sets.newHashSet();
   private final Set<auc> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public atx(xo $$0, bwz.a $$1, bwz.b $$2) {
      super(bcb.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acz::b);
      }
   }

   @Override
   public void a(bwz.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acz::d);
      }
   }

   @Override
   public void a(bwz.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acz::d);
      }
   }

   @Override
   public bwz a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acz::e);
      }

      return this;
   }

   @Override
   public bwz b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acz::e);
      }

      return this;
   }

   @Override
   public bwz c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acz::e);
      }

      return this;
   }

   @Override
   public void a(xo $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acz::c);
      }
   }

   private void a(Function<bwz, acz> $$0) {
      if (this.j) {
         acz $$1 = $$0.apply(this);

         for (auc $$2 : this.h) {
            $$2.g.b($$1);
         }
      }
   }

   public void a(auc $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.g.b(acz.a(this));
      }
   }

   public void b(auc $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.g.b(acz.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (auc $$0 : Lists.newArrayList(this.h)) {
            this.b($$0);
         }
      }
   }

   public boolean g() {
      return this.j;
   }

   public void d(boolean $$0) {
      if ($$0 != this.j) {
         this.j = $$0;

         for (auc $$1 : this.h) {
            $$1.g.b($$0 ? acz.a(this) : acz.a(this.i()));
         }
      }
   }

   public Collection<auc> h() {
      return this.i;
   }
}
