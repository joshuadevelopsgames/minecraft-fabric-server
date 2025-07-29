import com.mojang.datafixers.DSL.TypeReference;

public class blp {
   public static final TypeReference a = a("level");
   public static final TypeReference b = a("lightweight_level");
   public static final TypeReference c = a("player");
   public static final TypeReference d = a("chunk");
   public static final TypeReference e = a("hotbar");
   public static final TypeReference f = a("options");
   public static final TypeReference g = a("structure");
   public static final TypeReference h = a("stats");
   public static final TypeReference i = a("saved_data/command_storage");
   public static final TypeReference j = a("saved_data/tickets");
   public static final TypeReference k = a("saved_data/map_data");
   public static final TypeReference l = a("saved_data/idcounts");
   public static final TypeReference m = a("saved_data/raids");
   public static final TypeReference n = a("saved_data/random_sequences");
   public static final TypeReference o = a("saved_data/structure_feature_indices");
   public static final TypeReference p = a("saved_data/scoreboard");
   public static final TypeReference q = a("advancements");
   public static final TypeReference r = a("poi_chunk");
   public static final TypeReference s = a("entity_chunk");
   public static final TypeReference t = a("block_entity");
   public static final TypeReference u = a("item_stack");
   public static final TypeReference v = a("block_state");
   public static final TypeReference w = a("flat_block_state");
   public static final TypeReference x = a("data_components");
   public static final TypeReference y = a("villager_trade");
   public static final TypeReference z = a("particle");
   public static final TypeReference A = a("text_component");
   public static final TypeReference B = a("entity_equipment");
   public static final TypeReference C = a("entity_name");
   public static final TypeReference D = a("entity_tree");
   public static final TypeReference E = a("entity");
   public static final TypeReference F = a("block_name");
   public static final TypeReference G = a("item_name");
   public static final TypeReference H = a("game_event_name");
   public static final TypeReference I = a("untagged_spawner");
   public static final TypeReference J = a("structure_feature");
   public static final TypeReference K = a("objective");
   public static final TypeReference L = a("team");
   public static final TypeReference M = a("recipe");
   public static final TypeReference N = a("biome");
   public static final TypeReference O = a("multi_noise_biome_source_parameter_list");
   public static final TypeReference P = a("world_gen_settings");

   public static TypeReference a(final String $$0) {
      return new TypeReference() {
         public String typeName() {
            return $$0;
         }

         @Override
         public String toString() {
            return "@" + $$0;
         }
      };
   }
}
