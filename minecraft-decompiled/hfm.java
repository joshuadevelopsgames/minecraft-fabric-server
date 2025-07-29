import com.google.common.collect.Maps;
import java.util.Map;

public class hfm extends hcy<cmw, hlv, gmx> {
   private static final Map<cmw.a, ame> a = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmw.a.b, ame.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cmw.a.a, ame.b("textures/entity/cow/red_mooshroom.png"));
   });

   public hfm(hee.a $$0) {
      super($$0, new gmx($$0.a(gqm.bT)), new gmx($$0.a(gqm.bU)), 0.7F);
      this.a(new hio(this, $$0.d()));
   }

   public ame a(hlv $$0) {
      return a.get($$0.a);
   }

   public hlv b() {
      return new hlv();
   }

   public void a(cmw $$0, hlv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n();
   }
}
