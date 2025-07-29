import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eyw {
   private dvd a;
   private dwu b;
   private jb c;
   private boolean d;
   @Nullable
   private euq e;
   private eyk f;
   @Nullable
   private bck g;
   private int h;
   private final List<eyx> i;
   private boolean j;
   private boolean k;

   public eyw() {
      this.a = dvd.a;
      this.b = dwu.a;
      this.c = jb.c;
      this.f = eyk.b;
      this.i = Lists.newArrayList();
   }

   public eyw a() {
      eyw $$0 = new eyw();
      $$0.a = this.a;
      $$0.b = this.b;
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      $$0.h = this.h;
      $$0.i.addAll(this.i);
      $$0.j = this.j;
      $$0.k = this.k;
      return $$0;
   }

   public eyw a(dvd $$0) {
      this.a = $$0;
      return this;
   }

   public eyw a(dwu $$0) {
      this.b = $$0;
      return this;
   }

   public eyw a(jb $$0) {
      this.c = $$0;
      return this;
   }

   public eyw a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eyw a(euq $$0) {
      this.e = $$0;
      return this;
   }

   public eyw a(@Nullable bck $$0) {
      this.g = $$0;
      return this;
   }

   public eyw a(eyk $$0) {
      this.f = $$0;
      return this;
   }

   public eyw b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eyw b() {
      this.i.clear();
      return this;
   }

   public eyw a(eyx $$0) {
      this.i.add($$0);
      return this;
   }

   public eyw b(eyx $$0) {
      this.i.remove($$0);
      return this;
   }

   public dvd c() {
      return this.a;
   }

   public dwu d() {
      return this.b;
   }

   public jb e() {
      return this.c;
   }

   public bck b(@Nullable jb $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? bck.a(ag.c()) : bck.a(bcb.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public euq g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eyx> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eyk.b;
   }

   public eza.b a(List<eza.b> $$0, @Nullable jb $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eyw c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
