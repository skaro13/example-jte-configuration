/*
  specify which libraries to load: 
    In the Governance Tier configuration file, 
    these should be configurations common across 
    all apps governed by this config. 
*/
libraries{
  merge = true 
  sonarqube
}

stages{
    continuous_integration{
        unit_test
        static_code_analysis
        build
        scan_artifact
    }
}
