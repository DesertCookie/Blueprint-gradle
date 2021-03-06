package io.github.wordandahalf.blueprint.asm;


import org.objectweb.asm.*;


public class BlueprintClassVisitor extends ClassVisitor {
	
	
	public BlueprintClassVisitor( ClassVisitor visitor ) {
		super( Opcodes.ASM7,visitor );
	}
	
	public MethodVisitor visitMethod( int access,String name,String desc,String signature,String[] exceptions ) {
		MethodVisitor mv = super.visitMethod( access,name,desc,signature,exceptions );
		
		return mv;
	}
	
	
}
