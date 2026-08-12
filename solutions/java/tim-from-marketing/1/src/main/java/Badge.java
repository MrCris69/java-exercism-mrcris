class Badge {
    public String print(Integer id, String name, String department) {
        String badge=null;
        if(id!=null && department!=null){
            badge = String.format("[%d] - %s - %s",id,name,department.toUpperCase());
        }
        if(id==null && department==null){
            badge = String.format("%s - OWNER",name);
        }
        else{
            if(id==null){
            badge = String.format("%s - %s",name,department.toUpperCase());
            }
            if(department==null){
                badge = String.format("[%d] - %s - OWNER",id,name);
            }
        }
        
        return badge;
    }
}
