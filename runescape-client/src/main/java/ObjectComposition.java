import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eg")
@Implements("ObjectComposition")
public class ObjectComposition extends DualNode {
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("v")
	@Export("ObjectDefinition_isLowDetail")
	public static boolean ObjectDefinition_isLowDetail;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("ObjectDefinition_archive")
	public static AbstractArchive ObjectDefinition_archive;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ObjectDefinition_cached")
	static EvictingDualNodeHashTable ObjectDefinition_cached;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ObjectDefinition_cachedModelData")
	public static EvictingDualNodeHashTable ObjectDefinition_cachedModelData;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ObjectDefinition_cachedEntities")
	static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("ObjectDefinition_cachedModels")
	static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lgm;"
	)
	static ModelData[] field1758;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1257920551
	)
	@Export("id")
	public int id;
	@ObfuscatedName("s")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("u")
	@Export("models")
	int[] models;
	@ObfuscatedName("l")
	@Export("name")
	public String name;
	@ObfuscatedName("o")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("c")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("e")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("g")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -288612135
	)
	@Export("sizeX")
	public int sizeX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1812944985
	)
	@Export("sizeY")
	public int sizeY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1384594797
	)
	@Export("interactType")
	public int interactType;
	@ObfuscatedName("x")
	@Export("boolean1")
	public boolean boolean1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1747290425
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1982259081
	)
	@Export("clipType")
	int clipType;
	@ObfuscatedName("t")
	@Export("nonFlatShading")
	boolean nonFlatShading;
	@ObfuscatedName("h")
	@Export("modelClipped")
	public boolean modelClipped;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 91732693
	)
	@Export("animationId")
	public int animationId;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -2141564523
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 737098019
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1951915357
	)
	@Export("contrast")
	int contrast;
	@ObfuscatedName("ab")
	@Export("actions")
	public String[] actions;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 715137677
	)
	@Export("mapIconId")
	public int mapIconId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1953806269
	)
	@Export("mapSceneId")
	public int mapSceneId;
	@ObfuscatedName("ai")
	@Export("isRotated")
	boolean isRotated;
	@ObfuscatedName("ar")
	@Export("clipped")
	public boolean clipped;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2023882183
	)
	@Export("modelSizeX")
	int modelSizeX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -128734905
	)
	@Export("modelHeight")
	int modelHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1793446173
	)
	@Export("modelSizeY")
	int modelSizeY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1494268527
	)
	@Export("offsetX")
	int offsetX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -743874879
	)
	@Export("offsetHeight")
	int offsetHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -227509265
	)
	@Export("offsetY")
	int offsetY;
	@ObfuscatedName("av")
	@Export("boolean2")
	public boolean boolean2;
	@ObfuscatedName("ac")
	@Export("isSolid")
	boolean isSolid;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1364896901
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("ah")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -240174169
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 758936167
	)
	@Export("transformVarp")
	int transformVarp;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 805251355
	)
	@Export("ambientSoundId")
	public int ambientSoundId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -342258981
	)
	@Export("int4")
	public int int4;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 777161755
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1832840413
	)
	@Export("int6")
	public int int6;
	@ObfuscatedName("aa")
	@Export("soundEffectIds")
	public int[] soundEffectIds;
	@ObfuscatedName("au")
	public boolean field1801;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		ObjectDefinition_isLowDetail = false; // L: 17
		ObjectDefinition_cached = new EvictingDualNodeHashTable(4096); // L: 20
		ObjectDefinition_cachedModelData = new EvictingDualNodeHashTable(500); // L: 21
		ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(30); // L: 22
		ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 23
		field1758 = new ModelData[4]; // L: 24
	}

	ObjectComposition() {
		this.name = "null"; // L: 28
		this.sizeX = 1; // L: 33
		this.sizeY = 1; // L: 34
		this.interactType = 2; // L: 35
		this.boolean1 = true; // L: 36
		this.int1 = -1; // L: 37
		this.clipType = -1; // L: 38
		this.nonFlatShading = false; // L: 39
		this.modelClipped = false; // L: 40
		this.animationId = -1; // L: 41
		this.int2 = 16; // L: 42
		this.ambient = 0; // L: 43
		this.contrast = 0; // L: 44
		this.actions = new String[5]; // L: 45
		this.mapIconId = -1; // L: 46
		this.mapSceneId = -1; // L: 47
		this.isRotated = false; // L: 48
		this.clipped = true; // L: 49
		this.modelSizeX = 128; // L: 50
		this.modelHeight = 128; // L: 51
		this.modelSizeY = 128; // L: 52
		this.offsetX = 0; // L: 53
		this.offsetHeight = 0; // L: 54
		this.offsetY = 0; // L: 55
		this.boolean2 = false; // L: 56
		this.isSolid = false; // L: 57
		this.int3 = -1; // L: 58
		this.transformVarbit = -1; // L: 60
		this.transformVarp = -1; // L: 61
		this.ambientSoundId = -1; // L: 62
		this.int4 = 0; // L: 63
		this.int5 = 0; // L: 64
		this.int6 = 0; // L: 65
		this.field1801 = true; // L: 67
	} // L: 70

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.int1 == -1) { // L: 89
			this.int1 = 0; // L: 90
			if (this.modelIds != null && (this.models == null || this.models[0] == 10)) { // L: 91
				this.int1 = 1;
			}

			for (int var1 = 0; var1 < 5; ++var1) { // L: 92
				if (this.actions[var1] != null) {
					this.int1 = 1;
				}
			}
		}

		if (this.int3 == -1) { // L: 94
			this.int3 = this.interactType != 0 ? 1 : 0;
		}

	} // L: 95

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "1"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 99
			if (var2 == 0) { // L: 100
				return; // L: 103
			}

			this.decodeNext(var1, var2); // L: 101
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "-1041207607"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) { // L: 106
			var3 = var1.readUnsignedByte(); // L: 107
			if (var3 > 0) { // L: 108
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 109
					var1.offset += 3 * var3; // L: 117
				} else {
					this.models = new int[var3]; // L: 110
					this.modelIds = new int[var3]; // L: 111

					for (var4 = 0; var4 < var3; ++var4) { // L: 112
						this.modelIds[var4] = var1.readUnsignedShort(); // L: 113
						this.models[var4] = var1.readUnsignedByte(); // L: 114
					}
				}
			}
		} else if (var2 == 2) { // L: 120
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 5) { // L: 121
			var3 = var1.readUnsignedByte(); // L: 122
			if (var3 > 0) { // L: 123
				if (this.modelIds != null && !ObjectDefinition_isLowDetail) { // L: 124
					var1.offset += 2 * var3; // L: 129
				} else {
					this.models = null; // L: 125
					this.modelIds = new int[var3]; // L: 126

					for (var4 = 0; var4 < var3; ++var4) { // L: 127
						this.modelIds[var4] = var1.readUnsignedShort();
					}
				}
			}
		} else if (var2 == 14) { // L: 132
			this.sizeX = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 133
			this.sizeY = var1.readUnsignedByte();
		} else if (var2 == 17) { // L: 134
			this.interactType = 0; // L: 135
			this.boolean1 = false; // L: 136
		} else if (var2 == 18) { // L: 138
			this.boolean1 = false;
		} else if (var2 == 19) { // L: 139
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 21) { // L: 140
			this.clipType = 0;
		} else if (var2 == 22) { // L: 141
			this.nonFlatShading = true;
		} else if (var2 == 23) { // L: 142
			this.modelClipped = true;
		} else if (var2 == 24) { // L: 143
			this.animationId = var1.readUnsignedShort(); // L: 144
			if (this.animationId == 65535) { // L: 145
				this.animationId = -1;
			}
		} else if (var2 == 27) { // L: 147
			this.interactType = 1;
		} else if (var2 == 28) { // L: 148
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 29) { // L: 149
			this.ambient = var1.readByte();
		} else if (var2 == 39) { // L: 150
			this.contrast = var1.readByte() * 25;
		} else if (var2 >= 30 && var2 < 35) { // L: 151
			this.actions[var2 - 30] = var1.readStringCp1252NullTerminated(); // L: 152
			if (this.actions[var2 - 30].equalsIgnoreCase("Hidden")) { // L: 153
				this.actions[var2 - 30] = null;
			}
		} else if (var2 == 40) { // L: 155
			var3 = var1.readUnsignedByte(); // L: 156
			this.recolorFrom = new short[var3]; // L: 157
			this.recolorTo = new short[var3]; // L: 158

			for (var4 = 0; var4 < var3; ++var4) { // L: 159
				this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 160
				this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 161
			}
		} else if (var2 == 41) { // L: 164
			var3 = var1.readUnsignedByte(); // L: 165
			this.retextureFrom = new short[var3]; // L: 166
			this.retextureTo = new short[var3]; // L: 167

			for (var4 = 0; var4 < var3; ++var4) { // L: 168
				this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 169
				this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 170
			}
		} else if (var2 == 62) { // L: 173
			this.isRotated = true;
		} else if (var2 == 64) { // L: 174
			this.clipped = false;
		} else if (var2 == 65) { // L: 175
			this.modelSizeX = var1.readUnsignedShort();
		} else if (var2 == 66) { // L: 176
			this.modelHeight = var1.readUnsignedShort();
		} else if (var2 == 67) { // L: 177
			this.modelSizeY = var1.readUnsignedShort();
		} else if (var2 == 68) { // L: 178
			this.mapSceneId = var1.readUnsignedShort();
		} else if (var2 == 69) { // L: 179
			var1.readUnsignedByte(); // L: 180
		} else if (var2 == 70) { // L: 182
			this.offsetX = var1.readShort();
		} else if (var2 == 71) { // L: 183
			this.offsetHeight = var1.readShort();
		} else if (var2 == 72) { // L: 184
			this.offsetY = var1.readShort();
		} else if (var2 == 73) { // L: 185
			this.boolean2 = true;
		} else if (var2 == 74) { // L: 186
			this.isSolid = true;
		} else if (var2 == 75) { // L: 187
			this.int3 = var1.readUnsignedByte();
		} else if (var2 != 77 && var2 != 92) { // L: 188
			if (var2 == 78) { // L: 206
				this.ambientSoundId = var1.readUnsignedShort(); // L: 207
				this.int4 = var1.readUnsignedByte(); // L: 208
			} else if (var2 == 79) { // L: 210
				this.int5 = var1.readUnsignedShort(); // L: 211
				this.int6 = var1.readUnsignedShort(); // L: 212
				this.int4 = var1.readUnsignedByte(); // L: 213
				var3 = var1.readUnsignedByte(); // L: 214
				this.soundEffectIds = new int[var3]; // L: 215

				for (var4 = 0; var4 < var3; ++var4) { // L: 216
					this.soundEffectIds[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 81) { // L: 218
				this.clipType = var1.readUnsignedByte() * 256;
			} else if (var2 == 82) { // L: 219
				this.mapIconId = var1.readUnsignedShort();
			} else if (var2 == 89) { // L: 220
				this.field1801 = false;
			} else if (var2 == 249) { // L: 221
				this.params = ModeWhere.readStringIntParameters(var1, this.params);
			}
		} else {
			this.transformVarbit = var1.readUnsignedShort(); // L: 189
			if (this.transformVarbit == 65535) { // L: 190
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 191
			if (this.transformVarp == 65535) { // L: 192
				this.transformVarp = -1;
			}

			var3 = -1; // L: 193
			if (var2 == 92) { // L: 194
				var3 = var1.readUnsignedShort(); // L: 195
				if (var3 == 65535) { // L: 196
					var3 = -1;
				}
			}

			var4 = var1.readUnsignedByte(); // L: 198
			this.transforms = new int[var4 + 2]; // L: 199

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 200
				this.transforms[var5] = var1.readUnsignedShort(); // L: 201
				if (this.transforms[var5] == 65535) { // L: 202
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 204
		}

	} // L: 223

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1378932606"
	)
	public final boolean method2956(int var1) {
		if (this.models != null) { // L: 226
			for (int var4 = 0; var4 < this.models.length; ++var4) { // L: 236
				if (this.models[var4] == var1) { // L: 237
					return class310.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var4] & 65535, 0);
				}
			}

			return true; // L: 239
		} else if (this.modelIds == null) { // L: 227
			return true;
		} else if (var1 != 10) { // L: 228
			return true;
		} else {
			boolean var2 = true; // L: 229

			for (int var3 = 0; var3 < this.modelIds.length; ++var3) { // L: 230
				var2 &= class310.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var3] & 65535, 0); // L: 231
			}

			return var2; // L: 233
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-205337927"
	)
	@Export("needsModelFiles")
	public final boolean needsModelFiles() {
		if (this.modelIds == null) { // L: 244
			return true;
		} else {
			boolean var1 = true; // L: 245

			for (int var2 = 0; var2 < this.modelIds.length; ++var2) { // L: 246
				var1 &= class310.ObjectDefinition_modelsArchive.tryLoadFile(this.modelIds[var2] & 65535, 0); // L: 247
			}

			return var1; // L: 249
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIIB)Lgl;",
		garbageValue = "109"
	)
	@Export("getEntity")
	public final Renderable getEntity(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 254
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 255
		}

		Object var9 = (Renderable)ObjectDefinition_cachedEntities.get(var7); // L: 256
		if (var9 == null) { // L: 257
			ModelData var10 = this.getModelData(var1, var2); // L: 258
			if (var10 == null) { // L: 259
				return null;
			}

			if (!this.nonFlatShading) { // L: 260
				var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50);
			} else {
				var10.ambient = (short)(this.ambient + 64); // L: 262
				var10.contrast = (short)(this.contrast + 768); // L: 263
				var10.calculateVertexNormals(); // L: 264
				var9 = var10; // L: 265
			}

			ObjectDefinition_cachedEntities.put((DualNode)var9, var7); // L: 267
		}

		if (this.nonFlatShading) { // L: 269
			var9 = ((ModelData)var9).method3760(); // L: 270
		}

		if (this.clipType >= 0) { // L: 272
			if (var9 instanceof Model) { // L: 273
				var9 = ((Model)var9).contourGround(var3, var4, var5, var6, true, this.clipType);
			} else if (var9 instanceof ModelData) {
				var9 = ((ModelData)var9).method3761(var3, var4, var5, var6, true, this.clipType); // L: 274
			}
		}

		return (Renderable)var9; // L: 276
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIII)Lgr;",
		garbageValue = "-925676771"
	)
	@Export("getModel")
	public final Model getModel(int var1, int var2, int[][] var3, int var4, int var5, int var6) {
		long var7;
		if (this.models == null) { // L: 281
			var7 = (long)(var2 + (this.id << 10));
		} else {
			var7 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 282
		}

		Model var9 = (Model)ObjectDefinition_cachedModels.get(var7); // L: 283
		if (var9 == null) { // L: 284
			ModelData var10 = this.getModelData(var1, var2); // L: 285
			if (var10 == null) { // L: 286
				return null;
			}

			var9 = var10.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 287
			ObjectDefinition_cachedModels.put(var9, var7); // L: 288
		}

		if (this.clipType >= 0) {
			var9 = var9.contourGround(var3, var4, var5, var6, true, this.clipType); // L: 290
		}

		return var9; // L: 291
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II[[IIIILfl;II)Lgr;",
		garbageValue = "1200809976"
	)
	@Export("getModelDynamic")
	public final Model getModelDynamic(int var1, int var2, int[][] var3, int var4, int var5, int var6, SequenceDefinition var7, int var8) {
		long var9;
		if (this.models == null) { // L: 296
			var9 = (long)(var2 + (this.id << 10));
		} else {
			var9 = (long)(var2 + (var1 << 3) + (this.id << 10)); // L: 297
		}

		Model var11 = (Model)ObjectDefinition_cachedModels.get(var9); // L: 298
		if (var11 == null) { // L: 299
			ModelData var12 = this.getModelData(var1, var2); // L: 300
			if (var12 == null) { // L: 301
				return null;
			}

			var11 = var12.toModel(this.ambient + 64, this.contrast + 768, -50, -10, -50); // L: 302
			ObjectDefinition_cachedModels.put(var11, var9); // L: 303
		}

		if (var7 == null && this.clipType == -1) { // L: 305
			return var11;
		} else {
			if (var7 != null) { // L: 306
				var11 = var7.transformObjectModel(var11, var8, var2);
			} else {
				var11 = var11.toSharedSequenceModel(true); // L: 307
			}

			if (this.clipType >= 0) { // L: 308
				var11 = var11.contourGround(var3, var4, var5, var6, false, this.clipType);
			}

			return var11; // L: 309
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Lgm;",
		garbageValue = "1581886638"
	)
	@Export("getModelData")
	final ModelData getModelData(int var1, int var2) {
		ModelData var3 = null; // L: 313
		boolean var4;
		int var5;
		int var7;
		if (this.models == null) { // L: 314
			if (var1 != 10) { // L: 315
				return null;
			}

			if (this.modelIds == null) { // L: 316
				return null;
			}

			var4 = this.isRotated; // L: 317
			if (var1 == 2 && var2 > 3) { // L: 318
				var4 = !var4;
			}

			var5 = this.modelIds.length; // L: 319

			for (int var6 = 0; var6 < var5; ++var6) { // L: 320
				var7 = this.modelIds[var6]; // L: 321
				if (var4) { // L: 322
					var7 += 65536;
				}

				var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var7); // L: 323
				if (var3 == null) { // L: 324
					var3 = ModelData.ModelData_get(class310.ObjectDefinition_modelsArchive, var7 & 65535, 0); // L: 325
					if (var3 == null) { // L: 326
						return null;
					}

					if (var4) { // L: 327
						var3.method3769();
					}

					ObjectDefinition_cachedModelData.put(var3, (long)var7); // L: 328
				}

				if (var5 > 1) { // L: 330
					field1758[var6] = var3;
				}
			}

			if (var5 > 1) { // L: 332
				var3 = new ModelData(field1758, var5);
			}
		} else {
			int var9 = -1; // L: 335

			for (var5 = 0; var5 < this.models.length; ++var5) { // L: 336
				if (this.models[var5] == var1) { // L: 337
					var9 = var5; // L: 338
					break;
				}
			}

			if (var9 == -1) { // L: 342
				return null;
			}

			var5 = this.modelIds[var9]; // L: 343
			boolean var10 = this.isRotated ^ var2 > 3; // L: 344
			if (var10) { // L: 345
				var5 += 65536;
			}

			var3 = (ModelData)ObjectDefinition_cachedModelData.get((long)var5); // L: 346
			if (var3 == null) { // L: 347
				var3 = ModelData.ModelData_get(class310.ObjectDefinition_modelsArchive, var5 & 65535, 0); // L: 348
				if (var3 == null) { // L: 349
					return null;
				}

				if (var10) { // L: 350
					var3.method3769();
				}

				ObjectDefinition_cachedModelData.put(var3, (long)var5); // L: 351
			}
		}

		if (this.modelSizeX == 128 && this.modelHeight == 128 && this.modelSizeY == 128) { // L: 355
			var4 = false; // L: 356
		} else {
			var4 = true;
		}

		boolean var11;
		if (this.offsetX == 0 && this.offsetHeight == 0 && this.offsetY == 0) { // L: 358
			var11 = false; // L: 359
		} else {
			var11 = true;
		}

		ModelData var8 = new ModelData(var3, var2 == 0 && !var4 && !var11, this.recolorFrom == null, null == this.retextureFrom, true); // L: 360
		if (var1 == 4 && var2 > 3) { // L: 361
			var8.method3776(256); // L: 362
			var8.changeOffset(45, 0, -45); // L: 363
		}

		var2 &= 3; // L: 365
		if (var2 == 1) { // L: 366
			var8.method3763();
		} else if (var2 == 2) { // L: 367
			var8.method3829();
		} else if (var2 == 3) { // L: 368
			var8.method3765();
		}

		if (this.recolorFrom != null) { // L: 369
			for (var7 = 0; var7 < this.recolorFrom.length; ++var7) { // L: 370
				var8.recolor(this.recolorFrom[var7], this.recolorTo[var7]); // L: 371
			}
		}

		if (this.retextureFrom != null) { // L: 374
			for (var7 = 0; var7 < this.retextureFrom.length; ++var7) { // L: 375
				var8.retexture(this.retextureFrom[var7], this.retextureTo[var7]); // L: 376
			}
		}

		if (var4) { // L: 379
			var8.resize(this.modelSizeX, this.modelHeight, this.modelSizeY);
		}

		if (var11) { // L: 380
			var8.changeOffset(this.offsetX, this.offsetHeight, this.offsetY);
		}

		return var8; // L: 381
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leg;",
		garbageValue = "1894862325"
	)
	@Export("transform")
	public final ObjectComposition transform() {
		int var1 = -1; // L: 385
		if (this.transformVarbit != -1) { // L: 386
			var1 = Skeleton.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 387
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 389
			var2 = this.transforms[var1]; // L: 390
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class23.getObjectDefinition(var2) : null; // L: 391 392
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1270474150"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return SecureRandomFuture.method1977(this.params, var1, var2); // L: 396
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "110294181"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return FriendsList.method5650(this.params, var1, var2); // L: 400
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	@Export("hasSound")
	public boolean hasSound() {
		if (this.transforms == null) { // L: 411
			return this.ambientSoundId != -1 || this.soundEffectIds != null;
		} else {
			for (int var1 = 0; var1 < this.transforms.length; ++var1) { // L: 412
				if (this.transforms[var1] != -1) { // L: 413
					ObjectComposition var2 = class23.getObjectDefinition(this.transforms[var1]); // L: 414
					if (var2.ambientSoundId != -1 || var2.soundEffectIds != null) { // L: 415
						return true;
					}
				}
			}

			return false; // L: 418
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "1"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class379.field4146) { // L: 15
			class379.field4147 += class379.field4146 - var0; // L: 16
		}

		class379.field4146 = var0; // L: 18
		return class379.field4147 + var0; // L: 19
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "2009331321"
	)
	static int method2964(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1810
			class44.Interpreter_intStackSize -= 3; // L: 1811
			BufferedSource.queueSoundEffect(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]); // L: 1812
			return 1; // L: 1813
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1815
			class27.playSong(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 1816
			return 1; // L: 1817
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1819
			class44.Interpreter_intStackSize -= 2; // L: 1820
			GrandExchangeOfferNameComparator.method5059(Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]); // L: 1821
			return 1; // L: 1822
		} else {
			int var3;
			if (var0 == 3203) { // L: 1824
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize], 0), 100); // L: 1825
				PacketWriter.method2402(Math.round((float)var3 * 2.55F)); // L: 1826
				return 1; // L: 1827
			} else if (var0 == 3204) { // L: 1829
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Math.round((float)clientPreferences.musicVolume / 2.55F); // L: 1830
				return 1; // L: 1831
			} else if (var0 == 3205) { // L: 1833
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize], 0), 100); // L: 1834
				WorldMapLabelSize.updateSoundEffectVolume(Math.round(1.27F * (float)var3)); // L: 1835
				return 1; // L: 1836
			} else if (var0 == 3206) { // L: 1838
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Math.round((float)clientPreferences.soundEffectsVolume / 1.27F); // L: 1839
				return 1; // L: 1840
			} else if (var0 == 3207) { // L: 1842
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize], 0), 100); // L: 1843
				LoginPacket.method4373(Math.round((float)var3 * 1.27F)); // L: 1844
				return 1; // L: 1845
			} else if (var0 == 3208) { // L: 1847
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Math.round((float)clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1848
				return 1; // L: 1849
			} else {
				return 2; // L: 1851
			}
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IIIILoh;Lit;I)V",
		garbageValue = "-1287867325"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) { // L: 11231
			int var6 = Client.camAngleY & 2047; // L: 11232
			int var7 = var3 * var3 + var2 * var2; // L: 11233
			if (var7 <= 6400) { // L: 11234
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 11235
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 11236
				int var10 = var3 * var8 + var9 * var2 >> 16; // L: 11237
				int var11 = var3 * var9 - var8 * var2 >> 16; // L: 11238
				if (var7 > 2500) {
					var4.method6989(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths); // L: 11239
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2); // L: 11240
				}

			}
		}
	} // L: 11241

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "42"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 11427
		short[] var2 = new short[16]; // L: 11428
		int var3 = 0; // L: 11429

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) { // L: 11430
			ItemComposition var9 = class260.ItemDefinition_get(var4); // L: 11431
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 11432 11433 11434
				if (var3 >= 250) { // L: 11435
					ClanSettings.foundItemIdCount = -1; // L: 11436
					Clock.foundItemIds = null; // L: 11437
					return; // L: 11438
				}

				if (var3 >= var2.length) { // L: 11440
					short[] var6 = new short[var2.length * 2]; // L: 11441

					for (int var7 = 0; var7 < var3; ++var7) { // L: 11442
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 11443
				}

				var2[var3++] = (short)var4; // L: 11445
			}
		}

		Clock.foundItemIds = var2; // L: 11447
		Canvas.foundItemIndex = 0; // L: 11448
		ClanSettings.foundItemIdCount = var3; // L: 11449
		String[] var8 = new String[ClanSettings.foundItemIdCount]; // L: 11450

		for (int var5 = 0; var5 < ClanSettings.foundItemIdCount; ++var5) { // L: 11451
			var8[var5] = class260.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = Clock.foundItemIds; // L: 11452
		PacketBufferNode.sortItemsByName(var8, var10, 0, var8.length - 1); // L: 11454
	} // L: 11456
}
