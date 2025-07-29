import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record aei(fce b, byte c, boolean d, Optional<List<fca>> e, Optional<fcg.c> f) implements zw<acq> {
   public static final zm<wx, aei> a = zm.a(fce.b, aei::b, zk.c, aei::e, zk.b, aei::f, fca.a.a(zk.a()).a(zk::a), aei::g, fcg.c.a, aei::h, aei::new);

   public aei(fce $$0, byte $$1, boolean $$2, @Nullable Collection<fca> $$3, @Nullable fcg.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zy<aei> a() {
      return ahk.P;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public void a(fcg $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<fca>> g() {
      return this.e;
   }

   public Optional<fcg.c> h() {
      return this.f;
   }
}
