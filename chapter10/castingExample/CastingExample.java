package com.example.godofjava.chapter10.castingExample;

public class CastingExample {
    public static void main(String[] args) {
        CastingExample castingExample = new CastingExample();
        castingExample.objectCastArray();
    }

    public void objectCast() {
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting)parent2;
    }

    public void objectCastArray() {
        ParentCasting[] parentCastings = new ParentCasting[3];
        parentCastings[0] = new ChildCasting();
        parentCastings[1] = new ParentCasting();
        parentCastings[2] = new ChildCasting();
        objectTypeCheck(parentCastings);
    }

    public void objectTypeCheck(ParentCasting... parentCastings) {
        for (ParentCasting item : parentCastings) {
            if (item instanceof ParentCasting) {
                ParentCasting parent = (ParentCasting) item;
            } else if(item instanceof ChildCasting) {
                ChildCasting child = (ChildCasting) item;
                child.printAge();
            }
        }
    }

//    public void objectTypeCheck(ParentCasting... parentCastings) {
//        for (ParentCasting item : parentCastings) {
//            if (item instanceof ChildCasting) {
//                ChildCasting child = (ChildCasting) item;
//                child.printAge();
//            } else if(item instanceof ParentCasting) {
//                ParentCasting parent = (ParentCasting) item;
//            }
//        }
//    }
}
