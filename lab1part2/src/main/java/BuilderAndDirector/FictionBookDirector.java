/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderAndDirector;

/**
 *
 * @author annamutovkina
 */
public class FictionBookDirector {
    private FictionBookBuilderFix builder;
    public FictionBookDirector(FictionBookBuilderFix builder){
        this.builder = builder;
    }

    public FictionBookBuilderFix getBuilder(){
        return this.builder;
    }
    public void constructArtisticBook() {
        builder.buildName();
        builder.buildGenre();
    }
}
