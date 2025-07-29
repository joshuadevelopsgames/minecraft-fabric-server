import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface djz extends dka {
   Codec<djz> b = mm.as.q().dispatch(djz::a, Function.identity());

   static MapCodec<? extends djz> a(jy<MapCodec<? extends djz>> $$0) {
      jy.a($$0, "all_of", djt.a.a);
      jy.a($$0, "apply_mob_effect", dju.a);
      jy.a($$0, "change_item_damage", djv.a);
      jy.a($$0, "damage_entity", djw.a);
      jy.a($$0, "explode", dkc.a);
      jy.a($$0, "ignite", dkd.a);
      jy.a($$0, "play_sound", dkf.a);
      jy.a($$0, "replace_block", dkh.a);
      jy.a($$0, "replace_disk", dki.a);
      jy.a($$0, "run_function", dkj.a);
      jy.a($$0, "set_block_properties", dkk.a);
      jy.a($$0, "spawn_particles", dkm.a);
      return jy.a($$0, "summon_entity", dkn.a);
   }

   void a(aub var1, int var2, djh var3, bzm var4, fis var5);

   @Override
   default void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends djz> a();
}
