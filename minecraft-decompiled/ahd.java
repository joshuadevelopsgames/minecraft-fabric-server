import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ahd implements zw<acq> {
   public static final zm<wx, ahd> a = zw.a(ahd::a, ahd::new);
   private final boolean b;
   private final List<aj> c;
   private final Set<ame> d;
   private final Map<ame, al> e;
   private final boolean f;

   public ahd(boolean $$0, Collection<aj> $$1, Set<ame> $$2, Map<ame, al> $$3, boolean $$4) {
      this.b = $$0;
      this.c = List.copyOf($$1);
      this.d = Set.copyOf($$2);
      this.e = Map.copyOf($$3);
      this.f = $$4;
   }

   private ahd(wx $$0) {
      this.b = $$0.readBoolean();
      this.c = aj.b.decode($$0);
      this.d = $$0.a(Sets::newLinkedHashSetWithExpectedSize, wg::q);
      this.e = $$0.a(wg::q, al::b);
      this.f = $$0.readBoolean();
   }

   private void a(wx $$0) {
      $$0.a(this.b);
      aj.b.encode($$0, this.c);
      $$0.a(this.d, wg::a);
      $$0.a(this.e, wg::a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.f);
   }

   @Override
   public zy<ahd> a() {
      return ahk.bf;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public List<aj> b() {
      return this.c;
   }

   public Set<ame> e() {
      return this.d;
   }

   public Map<ame, al> f() {
      return this.e;
   }

   public boolean g() {
      return this.b;
   }

   public boolean h() {
      return this.f;
   }
}
